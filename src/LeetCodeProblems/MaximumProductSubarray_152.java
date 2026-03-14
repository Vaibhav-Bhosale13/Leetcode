package LeetCodeProblems;


/*Given an integer array nums, find a subarray that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

Note that the product of an array with a single element is the value of that element.

Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.*/

public class MaximumProductSubarray_152 {
    public static void main(String[] args) {

        int[] arr={-2,0,-1,2,3};
        System.out.println(maxProduct(arr));
        System.out.println(maxProductOptimized(arr));
    }

    public static int maxProduct(int[] nums) {
        if(nums==null||nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];

        int maxProduct = 0;
        for(int i=0;i<nums.length;i++){
            int currentProduct = 1;
            for(int j=i;j<nums.length;j++){
                currentProduct *=nums[j];
                maxProduct = Math.max(currentProduct,maxProduct);
            }
        }
        return maxProduct;
    }

    // optimized soln
    public static int maxProductOptimized(int[] nums) {
        if(nums==null||nums.length==0)
            return 0;

        int ans=1;
        int maxProduct = nums[0];
        int minProduct = nums[0];
        for(int i=1;i<nums.length;i++){
            int currentProduct = 1;

            if(nums[i]<0){
                int temp=maxProduct;
                maxProduct=Math.max(nums[i],minProduct*nums[i]);
                minProduct=Math.min(nums[i],temp*nums[i]);
            }

            maxProduct = Math.max(nums[i],maxProduct*nums[i]);
            minProduct=Math.min(nums[i],minProduct*nums[i]);

            ans = Math.max(ans,maxProduct);
        }
        return ans;
    }
}
