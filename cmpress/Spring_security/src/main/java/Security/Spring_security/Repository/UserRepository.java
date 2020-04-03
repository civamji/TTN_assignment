package Security.Spring_security.Repository;

import Security.Spring_security.Entiity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

    User findByUsername(String username);
}