import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class q5_consumerSupplier{
    public static void main(String[] args) {
        //Implementing Consumer interface using lambda
        Consumer<Integer> consumer=a-> System.out.println(a);
        consumer.accept(10);
        //Implementing Predicate interface using lambda
        Predicate<Integer> predicate=i->(i>10);
        System.out.println(predicate.test(40));
        //Implementing Supplier interface using lambda
        Supplier<Double> supplier=()->Math.random();
        System.out.println(supplier.get());
        //Implementing Function interface using lambda
        Function<Integer,Double> function=a->a/2.0;
        System.out.println(function.apply(10));

        }
    }
