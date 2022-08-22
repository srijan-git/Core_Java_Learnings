package CollectionFramework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();
        Map<String, Integer> treeMap2 = new TreeMap<>();
        //Naturally Ordered

        treeMap.put(2, "A");
        treeMap.put(1, "C");
        treeMap.put(3, "B");

        System.out.println("Numbers as key: " + treeMap);


        treeMap2.put("A", 2);
        treeMap2.put("C", 1);
        treeMap2.put("B", 3);

        System.out.println("Character as key: " + treeMap2);
    }
}
