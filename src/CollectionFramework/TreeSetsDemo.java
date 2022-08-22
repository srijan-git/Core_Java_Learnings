package CollectionFramework;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetsDemo {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        Set<Integer> treeSetNumber = new TreeSet<>();

        treeSet.add("C");
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("A");
        System.out.println(treeSet);
        //Natural order is always be maintained in TreeSet


        treeSetNumber.add(4);
        treeSetNumber.add(2);
        treeSetNumber.add(1);
        treeSetNumber.add(3);
        System.out.println(treeSetNumber);
        //Natural order is always be maintained in TreeSet


    }
}
