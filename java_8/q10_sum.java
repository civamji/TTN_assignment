import java.util.Arrays;
import java.util.List;
class q10_sum{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4,5,0,12,14,11);
        System.out.println(list.stream().filter(e->e>5).mapToInt(e->e).sum());

    }
}