package JPQL.EmployeeQuery.Repository;

import JPQL.EmployeeQuery.Entity.Employee;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

    @Query("from Employee")
    List<Employee> findAllEmployees();

    //Native Query 1
    @Query(value = "select empid,empfirstname,empage from Employee where emplastname='Sharma'",nativeQuery = true)
    public  List<Object[]> findByLastName();

    //Native Query 2
    @Transactional
    @Modifying
    @Query(value = "delete from Employee where empage >:age", nativeQuery = true)
    public void deleteEmployee(@Param("age") int age);


//    //JPQL Q1
//    @Query(value = "select AVG(salary) as avgSal from Employee")
//    public int findAvgSalary();
//
//    @Query(value = "select em.firstName, em.lastName from Employee em where em.salary >:avgSal")
//    List<Object[]> findFirstNameAndLastNameGreaterThanAverageSalary(@Param("avgSal")int avgSal, Sort sort);

    @Query(value = "select AVG(salary) as avgSal from Employee")
public int findAvgSalary();

    @Query(value = "select em.firstName, em.lastName from Employee em where em.salary >:avgSal")
    List<Object[]> findFirstNameAndLastNameGreaterThanAverageSalary(@Param("avgSal")int avgSal,Sort sort);




    //JPQL 2
    @Transactional
    @Modifying
    @Query(value = "update Employee set salary =:avgSal where salary <:avgSal")
    public void updateSalary(@Param("avgSal") int avgSal);

    //JPQL Q3
    @Query(value = "select MIN(salary) as minSal from Employee")
    public int findMinSalary();

    @Transactional
    @Modifying
    @Query("delete from Employee e where e.salary = :minSal")
    public void deleteMinSalaryEmployees(@Param("minSal") int minSal);

}

