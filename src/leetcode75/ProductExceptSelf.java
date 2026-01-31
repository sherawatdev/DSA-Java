package leetcode75;

import java.util.Arrays;

public class ProductExceptSelf {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
//        int[] nums = {-1,1,0,-3,3};
//        int[] nums = {2,3,0,0};
        int[] outArr = productExceptSelf(nums);
        System.out.println(Arrays.toString(outArr));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] outArr = new int[nums.length];
        int product = 1;
        int productOfZero = 1;
        int allZeroCount = 0;
        for (int i = 0; i< nums.length; i++) {
            int currentNum = nums[i];
            if (currentNum != 0) {
                productOfZero = productOfZero * currentNum;
            } else {
                allZeroCount++;
            }
            product = product * currentNum;
        }
        for (int i = 0; i< nums.length; i++) {
            if (allZeroCount > 1) {
                outArr[i] = 0;
            } else if (nums[i] == 0) {
                outArr[i] = productOfZero;
            } else {
                outArr[i] = product/nums[i];
            }
        }
        return outArr;
    }
}
