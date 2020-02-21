
import java.util.Scanner;
import java.util.*;
import java.util.Enumeration;
import java.util.Iterator;
import static java.text.NumberFormat.*;

class q1List
{
    public static void main(String[] args) {
        double sum=0d;
        List<Float> list = new ArrayList<Float>();
            Scanner scan=new Scanner(System.in);

        System.out.println("Enter 5  float numbers to find sum");
        for (int i = 0; i < 5; i++) {

            float num=scan.nextFloat();
            list.add(num);
        }
        Iterator<Float> itr=list.iterator();
        while(itr.hasNext())
        {
            sum=sum+(Float)itr.next();
        }

        System.out.println("The sum of float numbers is : "+sum);

    }
}