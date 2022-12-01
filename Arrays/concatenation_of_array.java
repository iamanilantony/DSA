// https://leetcode.com/problems/concatenation-of-array/

package Arrays;

import java.util.Arrays;

public class concatenation_of_array {
    public static void main(String[] args) {
        int[] nums = {11,22,33};
        int[] res = getConcatenation(nums);
        System.out.println(Arrays.toString(res)); 
    }
    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n *2];
        for(int i = 0; i<n ; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}
