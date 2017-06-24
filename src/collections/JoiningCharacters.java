package collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningCharacters {

    public static void main(String[] args) {
        List<String> letters = Arrays.asList("j", "a", "v", "a");
        String result = letters.stream()
                .collect(Collectors.joining())
                .toUpperCase();
        System.out.println(result);
    }
}
