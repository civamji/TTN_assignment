package com.spring_boot_assignment;
class LooseCoupling{
    public static void main(String[] args) {
        Manager obj=new Manager(new lazyWorker());
        obj.manageWork();
    }
}
class Manager{
    private Worker w;
    public Manager(Worker w) {
        this.w=w;
    }
    public void manageWork(){
        w.doWork();
    }
}
class lazyWorker implements Worker{

    public void doWork(){
        System.out.println("lazy is working \nP.S. haha kidding\n");
    }
}

class excellentWorker implements Worker{
    public void doWork(){
        System.out.println("smart one is working");
    }
}
interface Worker{
    void doWork();
}