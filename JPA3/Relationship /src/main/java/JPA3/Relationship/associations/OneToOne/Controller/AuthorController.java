package JPA3.Relationship.associations.OneToOne.Controller;

import JPA3.Relationship.associations.OneToOne.Dao.AuthorDao;
import JPA3.Relationship.associations.OneToOne.Entity.Author;
import JPA3.Relationship.associations.OneToOne.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class AuthorController {
    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private AuthorDao authorDao;

    @GetMapping("/savingDetails")
    public Author savingAuthorDetails()
    {


        Author author= authorDao.createAuthor();
        authorRepository.save(author);
        System.out.println(author);

        return author;
    }
}

