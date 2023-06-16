// https://leetcode.com/problems/running-sum-of-1d-array/ 

package Arrays;

import java.util.Arrays;

public class running_sum_of_1d_array {
    public static void main(String[] args) {
        int[] sums = {1,2,1,2,3,4};
        System.out.println(Arrays.toString(runningSum(sums)));
    }
    public static int[] runningSum(int[] nums) {
        for(int i=1; i < nums.length ; i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
}

