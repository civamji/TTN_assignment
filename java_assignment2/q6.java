import java.io.*;
import java.util.Scanner;
public class q6 {

    public static void main(String[] args) {

        try {
            System.out.println("Enter 1 to check Arithmstic Exception.2 to check ArrayIndexOutOfBounds Exception 3.Null pointer exception");
            Scanner sc=new Scanner(System.in);
            int input = sc.nextInt();
            String ptr = null;
            int a[] = new int[5];
            switch (input) {
                case 1:

                    a[5] = 30 / 0;
                case 2:
                    for (int i = 0; i <= 5; i++)
                    {  a[i] = i;}
                case 3:
                    if (ptr.equals("gfg"))
                        System.out.print("Same");
                    else
                        System.out.print("Not Same");
                default:
                    System.out.println("Enter right choice");
            }

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (NullPointerException e) {
            System.out.print("NullPointerException Caught");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        } finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code...");
    }

}

