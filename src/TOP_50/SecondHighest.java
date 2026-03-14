package TOP_50;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighest {
    public static void main(String[] args) {
        int[] arr  = {1,23,56,57,23,76,34};

        System.out.println("Second Highest using java: "+ findSecondHighestUsingJava(arr));
        System.out.println("Second Highest using Stream: "+ findSecondHighUsingStream(arr));
    }

    public static int findSecondHighestUsingJava(int[] arr) {

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > highest){
                secondHighest = highest;
                highest = arr[i];
            }else if(arr[i] >  secondHighest && arr[i]!=highest){
                secondHighest = arr[i];
            }
        }
        return secondHighest;
    }


    public  static int findSecondHighUsingStream(int[] arr) {

       Integer second = Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);

       return second;
    }
}
