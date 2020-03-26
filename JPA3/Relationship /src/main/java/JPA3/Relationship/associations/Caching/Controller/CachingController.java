package JPA3.Relationship.associations.Caching.Controller;

import JPA3.Relationship.associations.Caching.Entity.Caching;
import JPA3.Relationship.associations.Caching.Repository.CachingRepository;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;

import java.util.Optional;

@RestController
public class CachingController {

    @Autowired
            CachingRepository cachingRepository;


    @Autowired
    EntityManager entityManager;


    @GetMapping("/cachingCreate")
    public Caching caching() {
        Caching caching = new Caching();
        caching.setId(1);
        caching.setName("Vishal");
        cachingRepository.save(caching);
        Caching caching1 = new Caching();
        caching1.setId(2);
        caching1.setName("Shreyash");
        cachingRepository.save(caching1);
        Session session = entityManager.unwrap(Session.class);
        return caching;

    }


    @GetMapping("/evict")
    public Caching evictingObject() {
       Caching caching1=null;
       Optional<Caching> caching=cachingRepository.findAllById(1);
       // Optional<Caching> caching=cachingRepository.findAllById(1);
        if (caching.isPresent())
            caching1 = caching.get();
        cachingRepository.findById(1);
        cachingRepository.findById(1);
        Session session = entityManager.unwrap(Session.class);
        session.evict(caching1);
        cachingRepository.findById(1);
        return caching1;
    }

}