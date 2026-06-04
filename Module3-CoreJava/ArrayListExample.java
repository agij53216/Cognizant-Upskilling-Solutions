import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Enter names (type 'done' to stop):");
        while (true) {
            String name = sc.nextLine();
            if (name.equals("done")) break;
            names.add(name);
        }
        System.out.println("All names: " + names);
    }
}
