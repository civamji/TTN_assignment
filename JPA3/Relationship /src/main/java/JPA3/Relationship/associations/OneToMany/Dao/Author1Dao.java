package JPA3.Relationship.associations.OneToMany.Dao;
import JPA3.Relationship.associations.Common.Address;
import JPA3.Relationship.associations.Common.Subject;
import JPA3.Relationship.associations.OneToMany.Entity.Author1;
import JPA3.Relationship.associations.OneToMany.Entity.Book1;
import org.springframework.stereotype.Component;

@Component
public class Author1Dao {

    public Author1 createAuthor1() {

        Author1 author1 = new Author1();
        author1.setName("Preeti");


        Address address = new Address(125, "hauz khas", "Delhi");

        author1.setAddress(address);

        Subject subject = new Subject("Hibernate");
        Subject subject1 = new Subject("Spring");
        Subject subject2 = new Subject("java");

        author1.addSubjects(subject);
        author1.addSubjects(subject1);
        author1.addSubjects(subject2);

        Book1 book1 = new Book1();
        book1.setBookName("Learn java");

        Book1 book11 = new Book1();
        book11.setBookName("Learn c++");


        author1.addBooks(book1);
        author1.addBooks(book11);


        return author1;
    }
}
