import java.util.Arrays;
import java.util.Scanner;
public class q5 {
    public static void main(String[] args)
    {
        System.out.println("Enter values in two array to find the Common value");
        Scanner sc=new Scanner(System.in);
        int array1[],array2[];

        array1=new int[5];
        array2=new int[5];
        for (int i=0;i<5;i++)
        {

            array1[i]=sc.nextInt();
        }

        for (int i=0;i<5;i++)
        {

            array2[i]=sc.nextInt();
        }
        System.out.println("Array1 : "+Arrays.toString(array1));
        System.out.println("Array2 : "+Arrays.toString(array2));


        for(int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
               // array2[j]=0;
                if(array1[i] == (array2[j]))
                {

                    System.out.println("Common element is : "+(array1[i]));
                }
            }
        }

    }
}