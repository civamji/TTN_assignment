package JPA3.Relationship.associations.OneToMany.Controller;

import JPA3.Relationship.associations.OneToMany.Dao.Author2Dao;
import JPA3.Relationship.associations.OneToMany.Entity.Author2;
import JPA3.Relationship.associations.OneToMany.Repository.Author2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Author2Controller {


    @Autowired
    private Author2Repository author2Repository;

    @Autowired
    private Author2Dao author2Dao;

    @GetMapping("/savingAuthor2Details")
    public Author2 savingAuthor2Details(){
        Author2 author2= author2Dao.createAuthor2();
        author2Repository.save(author2);
        System.out.println(author2);
        return author2;
    }
}