package com.Final_assignment;

import com.constructor_Dependency_Injection.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class WorldController {
@Autowired
private Employee_Service employee_service;
//Print Welcome message
    @GetMapping(path = "/Say_hello")
    public String Display(){
        return "Welcome to Spring Boot:)";
    }


    //Create an Employee Bean(id, name, age) and service to  perform different operations related to employee.

    @GetMapping(path="/employees")
   public List<EmployeeDetails> findAllEmployees(){
        return employee_service.findAllEmployee();
    }
    @GetMapping("/employees/{id}")
    public EmployeeDetails findOneEmployee(@PathVariable int id)
    {
        EmployeeDetails employeeDetails=employee_service.findOneEmployee(id);
        if(employeeDetails==null)
        {
            throw new NotFoundException("employee with this id is not present ");
        }
        return employeeDetails;
    }


    @PostMapping("/employees")
    public void Add_Employee(@Valid @RequestBody EmployeeDetails employeeDetails){
        EmployeeDetails employeeDetails1=employee_service.Add_Employee(employeeDetails);
    }


    @DeleteMapping("/employees/{id}")
    public void Delete_Employee(@PathVariable int id){
        EmployeeDetails employeeDetails=employee_service.Delete_Employee(id);
        if(employeeDetails==null){
            throw new RuntimeException();
        }
    }
    @PutMapping("employees/update/{id}")
    public void updateOne(@PathVariable int id, @RequestBody EmployeeDetails employeesModel){
        employee_service.updateRecord(id, employeesModel);
    }
}
