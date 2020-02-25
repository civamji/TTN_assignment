
//Implement multiple inheritance with default method inside  interface.
interface multInherit1{
    default void show(){
        System.out.println("from interface one");
    }
}
interface multInherit2{
    default void show(){
        System.out.println("from interface two");
    }
}
public class q8_Multiface implements multInherit1, multInherit2{
    @Override
    public void show(){
        multInherit1.super.show();
        multInherit2.super.show();
    }

    public static void main(String[] args) {
        q8_Multiface obj=new q8_Multiface();
        obj.show();
    }
}