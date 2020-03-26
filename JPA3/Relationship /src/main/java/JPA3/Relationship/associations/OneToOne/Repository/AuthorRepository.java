package JPA3.Relationship.associations.OneToOne.Repository;
import JPA3.Relationship.associations.OneToOne.Entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Integer> {

}