import java.util.Scanner;

class q7
{
// static block

    static {
        System.out.println("First name: Shivam");
    }

//static varibale
    static int age=m1();


    
    //static method
    static int m1() {
        System.out.println("Last name: Sharma");
        //Enter age
        System.out.println("Enter age");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Age is "+age);
    }
}