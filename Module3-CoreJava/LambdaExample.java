import java.util.*;

public class LambdaExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
            "Banana",
            "Apple",
            "Mango",
            "Cherry"
        );
        Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println("Sorted: " + names);
    }
}
