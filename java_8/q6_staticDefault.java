interface NewInterface {


    static void hello()
    {
        System.out.println("Hello, New Static Method Here");
    }


    default void Method2(String str){
        System.out.println(str+"Inside default method");
    }
}


public class q6_staticDefault implements NewInterface {

    public static void main(String[] args)
    {
        q6_staticDefault interfaceDemo = new q6_staticDefault();

        NewInterface.hello();
        interfaceDemo.Method2("hello !!");
    }
}
