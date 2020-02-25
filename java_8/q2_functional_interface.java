interface fun_Interface{
    int question2(int num1,int num2);
}
public class q2_functional_interface{
    public static void main(String[] args) {
        fun_Interface fun_interface=(n1,n2)->n1-n2;
        System.out.println(fun_interface.question2(3,2));
    }
}