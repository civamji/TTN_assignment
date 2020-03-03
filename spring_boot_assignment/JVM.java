package com.spring_boot_assignment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
class JVM implements Competency{
    public void getCompetency(){
        System.out.println("This is JVM group");
    }
}
