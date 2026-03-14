package TOP_50;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonReapetatingChar {
    public static void main(String[] args) {

        String str = "Vaibihav";

        System.out.println(findChar(str));

        System.out.println(countCharStream(str));
    }

    public static Character findChar(String str) {
        str = str.toLowerCase();

        Map<Character, Integer> map = new LinkedHashMap<>();
        str = str.toLowerCase();
        for (Character c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        Character c=null;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                c = entry.getKey();
                break;
            }
        }

        return c;
    }

    public static  Character countCharStream(String str){
        str= str.toLowerCase();                                             
      Character ch =   str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

      return ch;
    }
}
