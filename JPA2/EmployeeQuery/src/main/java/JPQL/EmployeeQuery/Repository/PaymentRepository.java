package JPQL.EmployeeQuery.Repository;
import JPQL.EmployeeQuery.Entity.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment,Integer> {

}