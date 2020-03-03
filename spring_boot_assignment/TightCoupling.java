package com.spring_boot_assignment;
public class TightCoupling {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.lazyWorker();
        employee.smartWorker();
    }
}
class Employee{
    void lazyWorker(){
        System.out.println("Lazy Worker does work");
    }
    void smartWorker(){
        System.out.println("Smart Worker does work");
    }
}
