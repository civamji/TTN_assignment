
class q7_2 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(500);
            }catch(Exception e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        q7_2 t1=new q7_2();
        q7_2 t2=new q7_2();
        q7_2 t3=new q7_2();

        t1.start();
        try{
            t1.join(1500);
        }catch(Exception e){System.out.println(e);}

        t2.start();
        t3.start();
    }
}