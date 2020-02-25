interface NewInterface2 {
    default void overrideMethod(String str){
    }
}
public class q7 implements NewInterface2 {

    public static void main(String[] args) {
        q7 obj = new q7();
        // Calling the abstract method of interface Overriding
        obj.overrideMethod("hello");
    }
    @Override
    public void overrideMethod(String str1){
        System.out.println("Abstract Method overridden");
    }
    }

