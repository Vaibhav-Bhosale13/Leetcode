package TOP_50;

public class FabinoccicSeries {
    public static void main(String[] args) {

        int n = 3;
        System.out.println(fabinoccicSeries(n));

    }

    public static int fabinoccicSeries(int n){

        if(n==0) return 0;
        if(n==1) return 1;

        return fabinoccicSeries(n-1) + fabinoccicSeries(n-2);
    }
}
