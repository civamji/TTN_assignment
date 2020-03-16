package com.example.employeeOperation;

import com.example.employeeOperation.entity.Employee;
import com.example.employeeOperation.repo.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Embedded;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeOperationApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository; //To perform changes to database we need it

	@Test
	void contextLoads() {
	}

	//Question:3 Create a Entity record

	@Test
	public void testCreateEmployee() {
		Employee employee = new Employee();
		employee.setId(2);
		employee.setName("Pinku");
		employee.setAge(24);
		employee.setLocation("East Delhi");
		employeeRepository.save(employee);
	}


	//Question:4 Updating a record
	@Test
	public void testUpdate() {
		Optional<Employee> EmployeeOptional = employeeRepository.findById(2);
		Employee employee = EmployeeOptional.get();
		employee.setAge(25);
		employeeRepository.save(employee);//by default a new select statement will be performed
	}


	//Question:5 Delete a Record

	@Test
	public void testDelete() {
		if (employeeRepository.existsById(2)) {
			System.out.println("Deleting a record................ding ding!!");
			employeeRepository.deleteById(2);
		}
	}


	///Question 6: Read all record
	@Test
	public void testRead() {
		System.out.println(employeeRepository.findAll());
	}

	//Question 7: Counting
	@Test
	public void testCount() {
		System.out.println("Total Record===============>>>>>>>>" + employeeRepository.count());
	}

	//	//Question:7 Pagination and Sorting on the bases of Employee Age
	@Test
	public void testFindAllPaging() {
		Pageable pageable = PageRequest.of(0, 3);
		Page<Employee> results = employeeRepository.findAll(pageable);
		results.forEach(p -> System.out.println(p.getName()));

	}

//Sorting on basis of Age

	@Test
	public void testSortOnBasisOfAge() {
		employeeRepository.findAll(Sort.by(Sort.Direction.ASC, "age")).forEach(p -> System.out.println(p.getAge()+" "+p.getName()+" "+p.getLocation()));
	}

//Question:8 Create and use finder to find Employee by Name


	@Test
	public void findByName() {
		List<Employee> employees = employeeRepository.findByName("Zeeshan Khan");
		employees.forEach(emp -> System.out.println(emp.getName() + "   " + emp.getAge() + " " + emp.getLocation()));
	}

	//			(9) Create and use finder to find Employees starting with A character
	@Test
	public void findByNameLike() {
		List<Employee> employees = employeeRepository.findByNameLike("V%");
		employees.forEach(emp -> System.out.println(emp.getName()));
	}

//(10) Create and use finder to find Employees Between the age of 28 to 32

	@Test
	public void testfindByAgeBetween() {

		List<Employee> employees = employeeRepository.findByAgeBetween(28, 32);
		employees.forEach(emp -> System.out.println(emp.getName()));

	}
}




