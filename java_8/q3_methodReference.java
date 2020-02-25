//Using (instance) Method reference create and apply add and subtract method and using (Static)
// Method reference create and apply multiplication method for the functional interface created.
interface GenericInterface{
    void manupulation(int a, int b);
}
public class q3_methodReference {
    static void sum(int a, int b){
        System.out.println("sum is: "+(a+b));
    }
    static void sub(int a, int b){
        if(a>b)
            System.out.println("difference is: "+(a-b));
        else
            System.out.println("difference is: "+(b-a));
    }
    void mult(int a, int b){
        System.out.println("product is: "+(b*a));
    }

    public static void main(String[] args) {
        GenericInterface manup=q3_methodReference::sum;
        GenericInterface manup1=q3_methodReference::sub;
        GenericInterface manup2=new q3_methodReference()::mult;
        manup.manupulation(10,20);
        manup1.manupulation(10,40);
        manup2.manupulation(5,4);
    }
}