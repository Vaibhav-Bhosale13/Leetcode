package TOP_50;

public class PrimeOrNot {
    public static void main(String[] args) {
        int n= 13   ;
        System.out.println(isPrime(n));
    }

    public static boolean isPrime(int n){

        if(n<0) return false;
        if(n==1) return true;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
