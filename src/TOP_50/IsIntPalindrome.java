package TOP_50;

public class IsIntPalindrome {

    public static void main(String[] args) {
        int n1 = 123;
        int n2 = 121;

        System.out.println(isPalindrome(n1));
        System.out.println(isPalindrome(n2));
    }

    public static boolean isPalindrome(int n){

        int original=n;
        int reverse=0;

        while(n > 0){
            int digit = n % 10;
            reverse  = reverse*10 + digit;
            n = n/10;
        }

        if(reverse==original){
            return true;
        }
        return false;
    }
}
