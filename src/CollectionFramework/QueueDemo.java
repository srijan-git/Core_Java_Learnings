package CollectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        queue.add("India");
        queue.add("Germany");
        queue.add("America");
        System.out.println("Original Queue: " + queue);

        queue.remove();
        System.out.println("Queue after removing the head element: " + queue);

        String head = queue.peek();
        System.out.println("The head of the queue: " + head);

        head = queue.poll();
        System.out.println("Removed Head: " + head);

        System.out.println("Queue now look like this: " + queue);
    }

}
