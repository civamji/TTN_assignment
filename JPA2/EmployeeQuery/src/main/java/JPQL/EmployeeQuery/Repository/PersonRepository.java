package JPQL.EmployeeQuery.Repository;



import JPQL.EmployeeQuery.Entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}