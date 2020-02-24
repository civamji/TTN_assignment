
import java.util.concurrent.*;
class Shared
{
    static int count = 0;
}

class MyThread extends Thread
{
    Semaphore sem;
    String threadName;
    public MyThread(Semaphore sem, String threadName)
    {
        super(threadName);
        this.sem = sem;
        this.threadName = threadName;
    }

    @Override
    public void run() {

        // run by thread A
        if(this.getName().equals("A"))
        {
            System.out.println("Starting " + threadName);
            try
            {
                System.out.println(threadName + " is waiting for a permit.");
                sem.acquire();
                System.out.println(threadName + " gets a permit.");
                for(int i=0; i < 5; i++)
                {
                    Shared.count++;
                    System.out.println(threadName + ": " + Shared.count);

                    // Now, allowing a context switch -- if possible.
                    // for thread B to execute
                    Thread.sleep(10);
                }
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }

            // Release the permit.
            System.out.println(threadName + " releases the permit.");
            sem.release();
        }

        // run by thread B
        else
        {
            System.out.println("Starting " + threadName);
            try
            {
                System.out.println(threadName + " is waiting for a permit.");
                sem.acquire();
                System.out.println(threadName + " gets a permit.");
                for(int i=0; i < 5; i++)
                {
                    Shared.count--;
                    System.out.println(threadName + ": " + Shared.count);

                    // Now, allowing a context switch -- if possible.
                    // for thread A to execute
                    Thread.sleep(10);
                }
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
            // Release the permit.
            System.out.println(threadName + " releases the permit.");
            sem.release();
        }
    }
}

public class q8Semaphore
{
    public static void main(String args[]) throws InterruptedException
    {
        Semaphore sem = new Semaphore(2);

        MyThread mt1 = new MyThread(sem, "A");
        MyThread mt2 = new MyThread(sem, "B");
        MyThread mt3 = new MyThread(sem, "C");
        MyThread mt4 = new MyThread(sem, "D");

        // stating threads A and B
        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();
        mt1.join();
        mt2.join();
        mt3.join();
        mt4.join();
        System.out.println("count: " + Shared.count);
    }
} 
