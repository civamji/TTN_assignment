package JPA3.Relationship.associations.OneToMany.Dao;
import JPA3.Relationship.associations.Common.Address;
import JPA3.Relationship.associations.Common.Subject;
import JPA3.Relationship.associations.OneToMany.Entity.Author2;
import JPA3.Relationship.associations.OneToMany.Entity.Book2;
import org.springframework.stereotype.Component;

@Component
public class Author2Dao {

    public Author2 createAuthor2() {

        Author2 author2 = new Author2();
        author2.setName("Sagar");


        Address address = new Address(134, "noida", "UP");
        author2.setAddress(address);

        Subject subject = new Subject("C#");
        Subject subject1 = new Subject("Android");
        Subject subject2 = new Subject("Advance java");

        author2.addSubjects(subject);
        author2.addSubjects(subject1);
        author2.addSubjects(subject2);

        Book2 book2 = new Book2();
        book2.setBookName("Learn android");
        book2.setAuthor2(author2);

        Book2 book21 = new Book2();
        book21.setBookName("Learn C#");
        book21.setAuthor2(author2);


        author2.addBooks(book2);
        author2.addBooks(book21);


        return author2;
    }
}