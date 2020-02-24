import java.util.List;

class Line{
    //getLine method is Synchronize so no two thread can acess it same time
    synchronized public void getLine(){
        for(int i=0;i<3;i++){

            System.out.println(Thread.currentThread().getName()+" Cycle :"+i);
            try {
              Thread.sleep(400);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class Train extends Thread
{
    Line line;
    Train(Line line){
        this.line=line;
    }
    public void run()
    {
        line.getLine();
    }
}



class q3{
    public static void main(String[] args) {
        Line obj=new Line();
        Train Train1=new Train(obj);
        Train Train2=new Train(obj);
        Train Train3=new Train(obj);
        Train1.start();
        Train2.start();
        Train3.start();

    }
}
