// https://leetcode.com/problems/create-target-array-in-the-given-order/submissions/857369813/

package Arrays;

import java.util.*;

public class create_target_array_in_the_given_order {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] res = createTargetArray(nums, index);
        System.out.println(Arrays.toString(res));
    }
    public static int[] createTargetArray(int[] nums, int[] index){
        List<Integer> list = new ArrayList<>(nums.length);
        for(int i=0; i<nums.length; i++){
            list.add(index[i],nums[i]);
        }
        for(int i=0; i<nums.length; i++)
        {
            nums[i] = list.get(i); 
        }
        return nums;
    }
}
