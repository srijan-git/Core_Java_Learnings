package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class HashMapDemo {
    public static void main(String[] args) {
        //Whenever we need to store data as key value pair in java map is used in such scenarios
        //Keys have to be unique but values can be duplicate
        //Map uses Set class to store unique keys and it uses list class to store values


        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);
        hashMap.put("D", 3);

        System.out.println("The size of the Map: " + hashMap.size());
        System.out.println(hashMap);


        if (hashMap.containsKey("A")) {
            Integer a = hashMap.get("A");
            System.out.println("Value for key" + " \"a\" is: " + a);
        }



        System.out.println("Using KeySet");
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }

        System.out.println("Using EntrySet");
        for (Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
