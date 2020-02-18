import java.util.Scanner;
class q10{

    void addition(int num1,int num2)
    {
        
         System.out.println("The sum of numbers is: "+(num1+num2));

    }
    // to add two double num
    void addition(double num1,double num2)
    {  
        System.out.println("The sum of numbers is: "+(num1+num2));
    }
    //to multiply two float numbers
    void multiplication(float num1,float num2)
    {
        
        System.out.println("The multiplication  of float number is: "+(num1*num2));
    }
    //to multiply two int

    void multiplication(int number1,int number2)
    {
     
        System.out.println("The multiplication of numbers is: "+(number1*number2));
    }
    //to concatinate two Strings
    void concatination(String str1,String str2)
    {
        str1=str1.concat(str2);
        System.out.println("After concatination:  "+str1);
    }
    ///to concatinate three strings
    void concatination(String str1,String str2,String str3)
    {
        str1=str1.concat(str2.concat(str3));
      System.out.println("After concatination: "+str1);
    }


    public static void main(String[] args) {
        System.out.println("Menu:  A) Adding 2 integer number \n B) Adding 2 double \n C) multiplying 2 float \n D) multiplying 2 int \n E) concate 2 string \n F) Concate 3 String");
        //enum choice{A,B,C,D,E,F}
        System.out.println("ENTER YoUR CHOICE");
        Scanner scan=new Scanner(System.in);
        char ch=scan.next().charAt(0);
        ch=Character.toLowerCase(ch);
        q10 m=new q10();
        switch (ch)
        {
            case 'a':
                System.out.println("Enter two integer value to add");
                int n1=scan.nextInt();
                int n2=scan.nextInt();
               q10.addition(n1,n2);
                break;

            case 'b':
                 System.out.println("Enter two double value to add");
                double d1=scan.nextInt();
                double d2=scan.nextInt();
               q10.addition(d1,d2);
                break;
            case 'c':
                 System.out.println("Enter two float value to multiply");
                float f1=scan.nextFloat();
                float f2=scan.nextFloat();
               q10.multiplication(f1,f2);
                break;
            case 'd':
                 System.out.println("Enter two int value to multiply");
                int nm1=scan.nextInt();
                int nm2=scan.nextInt();
               q10.multiplication(nm1,nm2);
                break;
            case 'e':
                 System.out.println("Enter two String to concatinate");
                String str1=scan.next();
                
                String str2=scan.next();
               m.concatination(str1,str2);
                break;
             case 'f':
                 System.out.println("Enter three String to concatinate");
                String string1=scan.next();
        
                String string2=scan.next();
            
                String string3=scan.next();
               m.concatination(string1,string2,string3);
                break;
            default:
                System.out.println("Wrong input");
               
        }
        }
    
}
