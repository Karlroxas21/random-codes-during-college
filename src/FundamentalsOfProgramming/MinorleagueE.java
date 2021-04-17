package FundamentalsOfProgramming;

import java.util.Arrays;

public class MinorleagueE {
    public static int[] addArray (int[] nums) {

        for (int i = nums.length - 1; i > -1; --i) {
            if (nums[i] != 9) {
                nums[i] += 1;
                for (int j = i + 1; j < nums.length; ++j) {
                    nums[j] = 0;
                }
                return nums;
            }
        }
        int[] result = new int[nums.length + 1];
        result[0] = 1;
        return result;
    }
  void call() {
        int[] nums_1 = {5, 6, 7};
        int[] nums_2 = {9, 9, 9};
        System.out.println("A = " + Arrays.toString(nums_1));
        System.out.println("A'= " + Arrays.toString(addArray(nums_1)));
        System.out.println();
        System.out.println("A = " + Arrays.toString(nums_2));
        System.out.println("A = " + Arrays.toString(addArray(nums_2)));
    }
}
