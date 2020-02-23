import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
public class q9CountDownLatch{
    public static void main(String[] args) throws InterruptedException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of threads to wait for(1-5)...........");
        int no_of_threads=sc.nextInt();
        CountDownLatch  countDownLatch=new CountDownLatch(no_of_threads);
        coders coder1=new coders(1000,countDownLatch,"Shivam");
        coders coder2=new coders(2000,countDownLatch,"vishal");
        coders coder3=new coders(3000,countDownLatch,"mohit");
        coders coder4=new coders(3500,countDownLatch,"saksham");
        coders coder5=new coders(4000,countDownLatch,"shreyash");
        coder1.start();
        coder2.start();
        coder3.start();
        coder4.start();
        coder5.start();

        //Latch waits for given no of threads
        countDownLatch.await();
        System.out.println(Thread.currentThread().getName()+":  has finished");

    }
}
class coders extends Thread {
    private int delay;

    CountDownLatch latch;

    public coders(int delay, CountDownLatch latch, String name) {

        super(name);
        this.delay = delay;
        this.latch = latch;
    }

    public void run() {
        try {
            Thread.sleep(delay);
            latch.countDown();
            System.out.println("Current thread:"+"->" + Thread.currentThread().getName() + " Finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}





