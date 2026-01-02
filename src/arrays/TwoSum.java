package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(
                        twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    private static int[] twoSum(int[] nums, int target) {
        int i = 0;
        HashMap<Integer, Integer> intHashMap = new HashMap<>();
        while (i < nums.length) {
            int temp = target - nums[i];
            if (intHashMap.containsKey(i)) {
                return new int[]{temp, nums[i]};
            }
            intHashMap.put(nums[i], i);
            i++;
        }
        return null;
    }
}
