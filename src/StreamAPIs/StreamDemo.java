package StreamAPIs;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        //Map
        List<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        numberList.add(50);
        
        List<Integer> squareList = numberList.stream().map(x -> x * x).collect(Collectors.toList());
        //collect.(Collectors.toList()) is a terminal operation which is used to convert stream into a new list
        System.out.println("List of Square Numbers: " + squareList);

        Set<Integer> SquareSet = numberList.stream().map(x -> x * x).collect(Collectors.toSet());
        System.out.println("List of Square Numbers: " + SquareSet);

        //Filter
        List<String> language = new ArrayList<>();
        language.add("Java");
        language.add("Python");
        language.add("JavaScript");

        List<String> FilterResult = language.stream().filter(s -> s.startsWith("J")).collect(Collectors.toList());
        System.out.println("Language Starting with 'J': " + FilterResult);
    }
}
