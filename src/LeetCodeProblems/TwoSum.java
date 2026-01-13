package LeetCodeProblems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
    int[] arr = {2,4,5,8,3};
    int target=9;

    int[] result= additonTwoSum(arr, target);
        for (int j : result) {
            System.out.print(j + " ");
        }

}
public static int[] additonTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int key = target - nums[i];

            if(map.containsKey(key)){
                return new int[] {map.get(key), i};
            }else{
                map.put(nums[i],i);
            }
        }

        return null;

    }

}
