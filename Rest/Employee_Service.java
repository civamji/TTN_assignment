package com.Final_assignment;

import com.constructor_Dependency_Injection.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.sql.Types.NULL;

@Component
public class Employee_Service {
    private static int Employee_count=4;
    private static List<EmployeeDetails> emp_list=new ArrayList<>();
    static {
        emp_list.add(new EmployeeDetails(1001, "Shivam", 24));
        emp_list.add(new EmployeeDetails(1002, "Puneet", 38));
        emp_list.add(new EmployeeDetails(1003, "Vivek", 74));
        emp_list.add(new EmployeeDetails(1004, "Ankit", 44));

    }

    //finding one Employee

    public EmployeeDetails findOneEmployee(int id){
        for (EmployeeDetails employeeDetails:emp_list){
            if(employeeDetails.getId()==id)
                return employeeDetails;
        }
        return null;
    }

    //Getting list of all employee
    public List<EmployeeDetails> findAllEmployee(){
        return emp_list;
    }


    public void updateRecord(int id, EmployeeDetails employeeDetails) {
        Iterator<EmployeeDetails> iterator=emp_list.iterator();
        while (iterator.hasNext()){
            EmployeeDetails EmployeeDetails1=iterator.next();
            if(EmployeeDetails1.getId()==id){
                EmployeeDetails1.setId(employeeDetails.getId());
                EmployeeDetails1.setName(employeeDetails.getName());
                EmployeeDetails1.setAge(employeeDetails.getAge());
            }
        }
    }
    //Adding new Employee
    public EmployeeDetails Add_Employee(EmployeeDetails employeeDetails){
        if(employeeDetails.getId()==NULL){
            employeeDetails.setId(++Employee_count);
        }
        emp_list.add(employeeDetails);
        return employeeDetails;
    }

    //Delete a particular Employee
    public EmployeeDetails Delete_Employee(int id) {
        Iterator<EmployeeDetails> emp_iterator = emp_list.iterator();
        while (emp_iterator.hasNext()) {
            EmployeeDetails employeeDetails = emp_iterator.next();
            if (employeeDetails.getId() == id) {
                emp_iterator.remove();
                return employeeDetails;
            }
        }
        return null;
    //return something
    }
}
