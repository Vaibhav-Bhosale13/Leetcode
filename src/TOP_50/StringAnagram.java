package TOP_50;

import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "acb";

        System.out.println(isAnagram(str1,str2));
    }

    public static boolean isAnagram(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        for(int i=0;i<s1Array.length;i++){
            if(s1Array[i]!=s2Array[i]){
                return false;
            }
        }
        return true;
    }
}
