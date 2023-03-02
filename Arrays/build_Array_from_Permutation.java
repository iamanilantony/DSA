package Arrays;

import java.util.Arrays;

class build_Array_from_Permutation{
    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};
        int[] res = buildArray(nums);
        System.out.println(Arrays.toString(res));  
    }


    public static int[] buildArray(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            nums[i] = (nums[nums[i]]%nums.length) * nums.length + nums[i]; 
            //the purpose of adding nums[i] is to get the reminder when finding the modulus

        }
        for(int i=0; i<nums.length; i++){
            nums[i] /= nums.length;
        }
        return nums;
    }}