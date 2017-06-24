package collections;

import java.util.HashMap;
import java.util.Map;

public class MapComputations {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        /*
        Integer newValue = map.compute("d", (key, value) -> value == null ? 87 : value + 5);
        System.out.println(newValue);
        System.out.println(map);
        */

        /*
        map.putIfAbsent("d", 10);
        System.out.println(map);
        */

        /*
        Integer newValue = map.computeIfPresent("a", (key, value) -> value + 5);
        System.out.println(newValue);
        System.out.println(map);
        */

        Integer newValue = map.computeIfAbsent("d", (key) -> 10);
        System.out.println(newValue);
        System.out.println(map);
    }
}
