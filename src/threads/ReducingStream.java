package threads;

import java.util.Arrays;
import java.util.List;

public class ReducingStream {

    public static void main(String[] args) {
        /*
        List<String> vals = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h");
        String join = vals.parallelStream()
                .peek(System.out::println)
                .reduce("_",
                        (a, b) -> {
                            System.out.println("reducing " + a + " and " + b + " Thread: " + Thread.currentThread().getName());
                            return a.concat(b);
                        }
                );
        System.out.println(join);
        */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int result = numbers.parallelStream()
                .reduce(5,
                        (a, b) -> {
                            System.out.println("reducing " + a + " and " + b + " Thread: " + Thread.currentThread().getName());
                            return a + b;
                        });
        System.out.println(result);
    }
}
