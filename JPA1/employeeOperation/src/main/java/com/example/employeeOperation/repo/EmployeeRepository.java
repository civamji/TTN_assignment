package com.example.employeeOperation.repo;

import com.example.employeeOperation.entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.awt.print.Pageable;
import java.util.List;

//public interface EmployeeRepository extends CrudRepository<Employee,Integer>
 public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Integer>
{

//
//(8) Create and use finder to find Employee by Name

List<Employee> findByName(String name);

//(9) Create and use finder to find Employees starting with A character

    List<Employee> findByNameLike(String str);

//(10) Create and use finder to find Employees Between the age of 28 to 32

    List<Employee> findByAgeBetween(int value1,int value2);


}
