package com.spring_boot_assignment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootcampApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootcampApplication.class, args);
        ApplicationContext applicationContext=SpringApplication.run(BootcampApplication.class ,args);
        Trainee emp=applicationContext.getBean(Trainee.class);
        emp.setId(4130);
        emp.setName("Shivam");
        System.out.println(emp.toString());
        emp.showCompetency();


        Trainee emp1=new Trainee();
        emp1.setId(4130);
        emp1.setName("Shivam");
        System.out.println(emp1.toString());
        emp1.setCompetency1();
    }

}
