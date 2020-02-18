import java.util.Scanner;
class q6 {

   static int firstNonRepeating(int arr[], int n)
   {
       for (int i = 0; i < n; i++) {
           int j;
           for (j = 0; j < n; j++)
               if (i != j && arr[i] == arr[j])
                   break;
           if (j == n)
               return arr[i];
       }

       return -1;
   }


   public static void main(String[] args)
   {
       int[] array1;
       array1=new int[5];
   Scanner sc=new Scanner(System.in);
       System.out.println("Enter 5 numbers with repeatation expect one number");
       for (int i=0;i<5;i++)
       {

           array1[i]=sc.nextInt();
       }
       int n = array1.length;
       System.out.print("The number which is occuring only once is: "+firstNonRepeating(array1, n)+"..\t");
       //System.out.print(firstNonRepeating(array1, n));
   }
}


// import java.util.Scanner;
// class q6
// {
//  public static void main(String[] args)
//     {
//         int[] array1;
//         int nonrepeatingelement=0;
//         array1=new int[5];
//     Scanner sc=new Scanner(System.in);
//         System.out.println("Enter 5 numbers with repeatation expect one number:    ");
//         for (int i=0;i<5;i++)
//         {

//             array1[i]=sc.nextInt();
//         }
//         int n = array1.length;

//         for(int i=0;i<n;i++)
//         {
//             nonrepeatingelement=nonrepeatingelement^array1[i];
//         }
//         System.out.println("Non Repeating element is: \t "+nonrepeatingelement);
//     }
//    }
