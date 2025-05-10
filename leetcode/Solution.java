package Arrays;

import java.util.Arrays;

public class Solution {
    public void moveZeroes(int[] nums)
    {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0)
            {
                nums[j] = nums[i];
                j++;
            }
        }
        while(j < nums.length)
        {
            nums[j] = 0;
            j++;
        }
    }

    // Main method to test your code
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {0, 1, 0, 3, 12};  // Test case

        solution.moveZeroes(nums);  // Calling your moveZeroes method

        System.out.println(Arrays.toString(nums));  // Print the modified array
    }
}
