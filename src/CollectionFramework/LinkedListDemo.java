package CollectionFramework;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("B");
        list.add("C");
        list.addFirst("A");
        list.addLast("D");
        list.add(2, "E");

        list.remove("B");
        list.remove(3);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

    }
}
