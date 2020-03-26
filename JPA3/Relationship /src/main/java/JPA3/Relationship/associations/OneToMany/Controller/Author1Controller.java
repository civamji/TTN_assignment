package JPA3.Relationship.associations.OneToMany.Controller;

import JPA3.Relationship.associations.OneToMany.Dao.Author1Dao;
import JPA3.Relationship.associations.OneToMany.Entity.Author1;
import JPA3.Relationship.associations.OneToMany.Repository.Author1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Author1Controller {

    @Autowired
    private Author1Repository author1Repository;

    @Autowired
    private Author1Dao author1Dao;


    @GetMapping("/savingAuthor1Details")
    public Author1 savingAuthor1Details(){

        Author1 author1= author1Dao.createAuthor1();

        author1Repository.save(author1);
        System.out.println(author1);

        return author1;
    }
}