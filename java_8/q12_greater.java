import java.util.Arrays;
import java.util.List;
class q12_greater{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,5,6,8);
        System.out.println(list.stream().filter(e->e%2==0).filter(e->e>3).findFirst().orElse(0));

    }
}