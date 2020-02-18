import java.util.Scanner;
class q3
{
    public static void main(String[] args)
    { Scanner sc=new Scanner(System.in);
    	System.out.println("Program to find no. of occurance of specific character ")
        System.out.println("Please Enter a string.... ");

        String str1 = sc.nextLine();

        System.out.println("Enter the character which occurance to find");

       String str2=sc.nextLine();


        int count = str1.length() - str1.replace(str2,"").length();
        System.out.println("Number of occurances of  in "+str1+" = "+count);
    }
}