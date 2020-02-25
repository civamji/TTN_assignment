import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class q11_doubleAvg{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,5);
        System.out.println(list.stream().map(e->e*2).collect(Collectors.averagingDouble(e->e)));

    }
}
