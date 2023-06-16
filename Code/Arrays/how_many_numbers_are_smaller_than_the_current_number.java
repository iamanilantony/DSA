// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

package Arrays;

import java.util.Arrays;

public class how_many_numbers_are_smaller_than_the_current_number {
    public static void main(String[] args){
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(i != j && nums[i] > nums[j]) res[i]++;
            }
        }
        return res;
    }
}
