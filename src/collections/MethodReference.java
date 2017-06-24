package collections;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 2, 3);

        ls.stream()
                .map(MyProcessor::new)
                .forEach(MyProcessor::process);
    }
}

class MyProcessor {
    Integer value;

    public MyProcessor(Integer value) {
        this.value = value;
    }

    public void process() {
        System.out.println(value + " ");
    }
}