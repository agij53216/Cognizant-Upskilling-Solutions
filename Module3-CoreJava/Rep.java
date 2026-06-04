import java.util.*;

public class Rep {

    public static void main(String[] args) {
        String s = "aabbcdde";

        // step 1: count frequency of each character
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // step 2: find first character with count = 1
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                return; // stop after finding first one
            }
        }

        System.out.println(-1); // if no non-repeating char found
    }
}
