import java.lang.*;
import java.util.Scanner;
class q8{
    public static void main(String args[]){
    Scanner scanner=new Scanner(System.in);

        StringBuffer quote=new StringBuffer();
        System.out.println("Enter a quote");
        quote.append(scanner.nextLine());
        //reverse the string
        quote=quote.reverse();
      //  System.out.println(quote.charAt(0));
		System.out.println("   The reverse is:   "+quote);//prints Hello Java
		//System.out.println("Delete 4 to 9 ");
		quote=quote.delete(4,10);
		System.out.println("after deletetion the quote is:     "+quote);


    }
}