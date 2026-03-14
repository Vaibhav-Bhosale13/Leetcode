package TOP_50;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacter {
    public static void main(String[] args) {

        String str = "VAibhav";

        System.out.println(countChar(str));

        System.out.println(countCharStream(str));
    }

    public static Map<Character, Integer> countChar(String str) {
        Map<Character, Integer> map = new HashMap<>();

        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        return map;
    }

    public  static Map<Character, Long> countCharStream(String str) {
        str = str.toLowerCase();
        Map<Character, Long> map = str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return map;
    }
}
