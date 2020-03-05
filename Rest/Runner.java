package com.Final_assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class Runner {
    public static void main(String[] args) {
        ApplicationContext applicationContext= SpringApplication.run(Runner.class,args);
    }
}
