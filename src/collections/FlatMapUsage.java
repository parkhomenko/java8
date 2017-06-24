package collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapUsage {

  public static void main(String[] args) {
    String s1 = "asdfasdf asdfsadf sasdf";
    String s2 = "asdfasdf asdfsadf";
    String s3 = "asdfasf adfsf";

    List<String> all = Arrays.asList(s1, s2, s3);

    all.stream()
        .flatMap(sentence -> Stream.of(sentence.split(" ")))
        .distinct()
        .forEach(System.out::println);
  }
}
