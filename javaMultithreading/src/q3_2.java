class Run implements Runnable
{
    public void run()
    {
        System.out.println("This is under run method");
    }
}
class q_2{
    public static void main(String[] args) {
        Run running=new Run();
        Thread thread=new Thread(running);

        thread.start();
    }
}