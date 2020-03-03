package com.spring_boot_assignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Trainee {
    private int id;
    private String name;
    private BigData bigData;
    @Autowired
    private Competency competency;

    //constructor injection
    @Autowired
    Trainee(Competency competency){
        this.competency=competency;
    }
    Trainee(){}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "id= "+id+" name= "+name;
    }
    //with ApplicationContext
    public void setCompetency(Competency competency) {
        this.competency = competency;
    }

    public void showCompetency(){
        competency.getCompetency();
    }

    //with Object
    public void setCompetency1(){
        BigData bigData=new BigData();
        bigData.getCompetency();
    }
}