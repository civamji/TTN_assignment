// Java program to illustrate
// ClassNotFoundException
public class q3{

    public static void main(String args[]) {
        try
        {
            Class.forName("GeeksForGeeks");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
}
