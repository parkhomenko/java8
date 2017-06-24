package collections;

import java.util.Arrays;
import java.util.List;

public class ListReduction {

  public static void main(String[] args) {
    List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5);
    int sum = elements.stream().mapToInt(v -> v).sum();
    System.out.println(sum);
  }
}
