package Arrays;
/*
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

import java.util.Arrays;

public class Que2 {
    public static void main(String[] args) {
        int[] nums = {3,2,4};

        int[] Output = new int[2];
        int n = nums.length;
        int target = 6;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                    if (nums[i] + nums[j] == target) {
//                        Output = {i, j};
                        Output[0] = i;
                        Output[1] = j;
                        break;
                    }
            }
        }

        System.out.println(Arrays.toString(Output));

    }
}
