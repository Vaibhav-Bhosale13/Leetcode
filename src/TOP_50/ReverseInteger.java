package TOP_50;

public class ReverseInteger {
    public static void main(String[] args) {

        int n=12345;

        System.out.println("Reverse number is : "+reverse(n));
    }

    public static int reverse(int n){
        int orignal = n;
        int reversed = 0;

        while(n > 0){
            int digits = n% 10;
            reversed = reversed * 10 + digits;
            n = n/10;
        }

        return reversed;
    }
}
