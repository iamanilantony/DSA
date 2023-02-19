package Arrays;

import java.util.Arrays;

public class reverse_an_array {
    public static void main(String[] args) {
        int[] nums = {1,31,5,12,5,-1};
        int n = 6;
        System.out.println(Arrays.toString(createReversedArray(nums, n)));
    }
    public static int[] createReversedArray(int[] nums, int n){
        n = n % nums.length;

        
        
    }
}






























// for(int i=0; i<=(n-1)/2; i++){
//     int temp = nums[i];
//     nums[i] = nums[n-i-1];
//     nums[n-i-1] = temp;
// }
// return nums;