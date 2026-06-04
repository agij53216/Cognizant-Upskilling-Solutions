import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        String rev = new StringBuilder(str).reverse().toString();

        if (str.equals(rev)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }
}
