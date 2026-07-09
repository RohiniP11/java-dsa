package Arrays;

//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//
//Return the array in the form [x1,y1,x2,y2,...,xn,yn].

import java.util.Arrays;

public class Que3 {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 6, 8, 3}; // {x1, x2, x3, y1, y2, y3}
        int n = 3;

        System.out.println(Arrays.toString(nums));
        int[] result = shuffle(nums, n);
        System.out.print(Arrays.toString(result));

        }

        static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];

        for (int i = 0; i < n; i++) {
            ans[2*i] = nums[i];
            ans[2*i + 1] = nums[i + n];
        }
        return ans;
    }
}
