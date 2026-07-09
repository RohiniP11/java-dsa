package Arrays;

/*
You are given an array nums with n elements (for example: [1, 2, 3]).

You need to create a new array ans that:

Is twice the size of nums (length 2n)

Contains two copies of nums, one after the other
 */

import java.util.Arrays;

public class Que1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        int n = nums.length;

        int[] ans = new int[2*n];

        for (int i = 0; i < n; i++){
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        System.out.print("nums: ");
        System.out.println(Arrays.toString(nums));

        System.out.print("ans: ");
        System.out.println(Arrays.toString(ans));
    }
}
