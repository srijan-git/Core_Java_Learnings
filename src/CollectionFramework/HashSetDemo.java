package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {


        Set<String> hashset = new HashSet<>();

        hashset.add("A");
        hashset.add("B");
        boolean r1 = hashset.add("C");
        boolean r2 = hashset.add("C");
        //add method return boolean value,now here if we need to know which one is added
        // we can check it by above code

        System.out.println("Added or Not: " + r1);
        System.out.println("Added or Not: " + r2);
        //Sets does not contains duplicate element
        System.out.println(hashset);


        System.out.println("Set contains C or not: " + hashset.contains("C"));


        hashset.remove("A");
        System.out.println("Set after removing A: " + hashset);

        for (String item : hashset) {
            System.out.println("HashSet contains: " + item);
        }
    }
}
