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
        int[] result = new int[nums.length * 2];
        for(int i=0;i<nums.length;i++){
            result[i] = nums[i];
            result[nums.length+i] = nums[i];
        }
        return result;
    }
}
