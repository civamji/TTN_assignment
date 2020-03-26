package JPA3.Relationship.associations.OneToOne.Dao;
import JPA3.Relationship.associations.Common.Address;
import JPA3.Relationship.associations.Common.Subject;
import JPA3.Relationship.associations.OneToOne.Entity.Author;
import JPA3.Relationship.associations.OneToOne.Entity.Book;
import org.springframework.stereotype.Component;


@Component
public class AuthorDao {

    public Author createAuthor(){

        Author author= new Author("Adam");

        Address address= new Address(123,"cantt","delhi");

        Subject subject= new Subject("Maths");
        Subject subject1= new Subject("English");
        Subject subject2= new Subject("hindi");

        Book book= new Book("Learn Hibernate");


        author.addSubjects(subject);
        author.addSubjects(subject1);
        author.addSubjects(subject2);
        author.setAddress(address);
        author.setBook(book);

        return author;
    }

}