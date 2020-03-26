package JPA3.Relationship.associations.ManyToMany.Dao;
import JPA3.Relationship.associations.Common.Address;
import JPA3.Relationship.associations.Common.Subject;

import JPA3.Relationship.associations.ManyToMany.Entity.Author4;
import JPA3.Relationship.associations.ManyToMany.Entity.Book4;
import org.springframework.stereotype.Component;

@Component
public class Author4Dao {

    public Author4 createAuthor4(){

        Author4 author4= new Author4();
        author4.setName("Parineeta");

        Address address= new Address(124,"palam","New Delhi");

        Subject subject= new Subject("SST");
        Subject subject1= new Subject("Science");
        Subject subject2= new Subject("Drawing");

        author4.addSubjects(subject);
        author4.addSubjects(subject1);
        author4.addSubjects(subject2);

        Book4 book4 = new Book4();
        book4.setBookName("Learn Spring Boot");


        Book4 book41= new Book4();
        book41.setBookName("Learn Hindi");


        author4.addBooks(book4);
        author4.addBooks(book41);
        author4.setAddress(address);

        book4.addAuthors(author4);

        return author4;

    }

}