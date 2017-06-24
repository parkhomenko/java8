package collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Partitioning {

    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17);
        Stream<Integer> primeStream = primes.stream();

        Predicate<Integer> test = k -> k > 10;

        primeStream.collect(Collectors.partitioningBy(test, Collectors.counting()))
                .entrySet().forEach(System.out::println);
    }
}
