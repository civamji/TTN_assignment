import org.w3c.dom.ls.LSOutput;

interface Task
{    //final int number_of_books=0;
    void issuebook();
    void returnbook();

}
 abstract class Person
{
     void details() {
         System.out.println("Inside person class: Parent class");
     }
}
   class q1{
    public static void main(String[] args) {
          Librarian librarian=new Librarian();
          Author author=new Author();
          Reader reader=new Reader();
          author.details();
          reader.details();
          librarian.details();
        librarian.issuebook();
        librarian.returnbook();

    }

}
class Author extends Person {
    void details()
    {
        System.out.println("Details of Author");
    }
    void print1() {
        System.out.println("Inside Author class which extends person class");
    }
}
class Reader extends Person {

    void details()
    {
        System.out.println("Details of Reader");
    }
    void print2() {
        System.out.println("Inside Reader class which extends Person class");
    }
}
class Librarian extends Person implements Task
{

    void details()
    {
        System.out.println("Details of Librarian");
    }
    @Override
    public void issuebook() {
        System.out.println("Inside Librarian=issuebook");
    }

    @Override
    public void returnbook() {
        System.out.println("Inside Librarian: returnbook");

    }
}
