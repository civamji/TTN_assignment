package com.example.employeeOperation;

import com.example.employeeOperation.entity.Employee;
import com.example.employeeOperation.repo.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EmployeeOperationApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext= SpringApplication.run(EmployeeOperationApplication.class,args);

	//	EmployeeRepository employeeRepo=applicationContext.getBean(EmployeeRepository.class);
	//	employeeRepo.save(new Employee("Shivam",3000,24,"Noida"));

	}

}
