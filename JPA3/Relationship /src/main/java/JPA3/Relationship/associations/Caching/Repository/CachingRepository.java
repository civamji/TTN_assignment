package JPA3.Relationship.associations.Caching.Repository;

import JPA3.Relationship.associations.Caching.Entity.Caching;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CachingRepository extends CrudRepository<Caching, Integer> {
   Optional<Caching> findAllById(int i);
}
