package JPQL.EmployeeQuery;
import JPQL.EmployeeQuery.Entity.*;
import JPQL.EmployeeQuery.Repository.Employee1Repository;
import JPQL.EmployeeQuery.Repository.EmployeeRepository;
import JPQL.EmployeeQuery.Repository.PaymentRepository;
import JPQL.EmployeeQuery.Repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootTest
class EmployeeQueryApplicationTests {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private PaymentRepository paymentRepository;

	@Autowired
	private PersonRepository personRepository;

	@Autowired
	private Employee1Repository employee1Repository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreateEmployee(){

		employeeRepository.save(new RegularEmployee(1,"Shivam","Sharma",1820,23,"Hibernate"));
		employeeRepository.save(new RegularEmployee(2,"Parineeta","Jain",1320,24,"Spring"));
		employeeRepository.save(new TraineeEmployee(3,"Himanshu","Bhansali",2130,25,"Data Science"));
		employeeRepository.save(new TraineeEmployee(4,"Azeem","faisal",2070,46,"Android"));
		employeeRepository.save(new TraineeEmployee(5,"Vishal","Sharma",7500,30,"DotNet"));

	}

	@Test
	public  void  testCreatePayment(){

		paymentRepository.save(new CreditCard(1,7500,1345));
		paymentRepository.save(new CreditCard(2,5500,3344));
		paymentRepository.save(new Cheque(1,8300,90009));
		paymentRepository.save(new Cheque(2,7400,32929));
	}


	@Test
	public void testCreatePerson(){

		personRepository.save(new Person(1,"Anuresh"));
		personRepository.save(new Coder(2,"Meena","Hibernate"));
		personRepository.save(new Tester(3,"Shreya",1260));

	}

	@Test
	public void testCreateEmployee1(){


		employee1Repository.save(new Employee1(1,"Shivam","Sharma",23,
				new Salary(1200,230,50,340)));


	}


	//native query 1
	@Test
	public void testfindByLastName(){
		List<Object[]> employeeList= employeeRepository.findByLastName();
		for(Object[] objects:employeeList)
		{
			System.out.println(objects[0]);
			System.out.println(objects[1]);
			System.out.println(objects[2]);

		}
	}


	//Native query2
	@Test
	public void testDeleteEmployeeByAge(){
		employeeRepository.deleteEmployee(45);
	}



	//JPQL Q1 Employees having salary greater than average salary

	@Test
	public void testFindFirstNameAndLastNameGreaterThanAverageSalary() {
		List<Object[]> emp = employeeRepository.findFirstNameAndLastNameGreaterThanAverageSalary(employeeRepository
				.findAvgSalary(),Sort.by(Sort.Order.asc("age"),(Sort.Order.desc("salary"))));
		for (Object[] objects : emp) {
			System.out.println("First Name: " + objects[0]);
			System.out.println("Last Name: " + objects[1]);
		}
	}




	//JPQL Q2 Set salary to average who's are less than average
	@Test
	public void testUpdateEmployeeWithSalaryGreaterThanAverageSalary(){
		System.out.println(">>>>>>>>>>>>>>>>Average Salary>>>>>>>>>>>>: "+ employeeRepository.findAvgSalary());

		employeeRepository.updateSalary(employeeRepository.findAvgSalary());
		employeeRepository.findAllEmployees().forEach(e-> System.out.println(e));
	}

	//JPQL Q3 Deleting the minimum salary employees
	@Test
	public void testDeleteMinSalary(){
		System.out.println(">>>>>>>>>>>>>>>>Minimum Salary>>>>>>>>>>>>>>: "+ employeeRepository.findMinSalary());

		employeeRepository.deleteMinSalaryEmployees(employeeRepository.findMinSalary());
		employeeRepository.findAllEmployees().forEach(e-> System.out.println(e));
	}
}