package collections;

import java.util.HashMap;
import java.util.Map;

public class MapMerging {

  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("S1", "x");
    map.put("S2", "x");

    map.merge("S2", "y", (v1, v2) -> v1.concat(v2));
    map.merge("S3", "y", (v1, v2) -> v1.concat(v2));

    System.out.println(map);
  }
}
