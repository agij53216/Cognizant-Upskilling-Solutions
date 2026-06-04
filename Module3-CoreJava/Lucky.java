import java.util.*;

public class Lucky {

    public static void main(String[] args) {
        String str = "JAMES";
        int Lucky_number = 0;

        for (int i = 0; i < str.length(); i++) {
            int ASCII_Value = (int) str.charAt(i);
            int index = i + 1;

            if (ASCII_Value % 2 != 0 || index % 2 != 0) {
                Lucky_number += ASCII_Value * index;
            }
        }
        System.out.print(Lucky_number);
    }
}
