package CollectionFramework;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Asia");
        stack.push("America");
        stack.push("Europe");

        System.out.println("Original Stack: " + stack);


        String popElement = stack.pop();
        System.out.println("Popped Element: " + popElement);

        System.out.println("Now the stack is looks like: " + stack);


        String TopElement = stack.peek();
        System.out.println("The element which is at the top: " + TopElement);
    }
}
