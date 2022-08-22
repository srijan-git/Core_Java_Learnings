package CollectionFramework;

import java.util.*;

public class VectorClassDemo {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<String>();
        //Adding elements using add() method of List
        vec.add("Tiger");
        vec.add("Lion");
        vec.add("Dog");
        vec.add("Elephant");


        Enumeration en = vec.elements();

        while (en.hasMoreElements())
            System.out.println(en.nextElement());
    }
}

