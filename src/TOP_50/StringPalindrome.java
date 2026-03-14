package TOP_50;

public class StringPalindrome {
    public static void main(String[] args) {
        
        String str1 = "121";
        String str2 = "Madam";
        
        System.out.println(isPlaindrome(str1));
        System.out.println(isPlaindrome(str2));


        StringBuilder sb = new StringBuilder(str1);
        sb.reverse();
        if(str1.equals(sb.toString())){
            System.out.println("String str1 is palindrome");
        }else{
            System.out.println("String str1 is not palindrome");
        }
        
    }
    
    public static boolean isPlaindrome(String str) {
        str=str.toLowerCase().trim() ;
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
