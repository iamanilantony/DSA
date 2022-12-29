// https://leetcode.com/problems/shuffle-the-array/

package Arrays;

import java.util.Arrays;

public class shuffle_the_array {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5,6};
        int n = 3; 
        int[] res = shuffle(x,n);
        System.out.println(Arrays.toString(res));
    }

    public static int[] shuffle(int[] nums, int n) {
        // int[] result = new int[nums.length];
        int[] temp = new int[nums.length];
        int j =0;
        for(int i =0; i<n; i++){
            temp[j++] = nums[i];
            temp[j+1] = nums[i+n];
        }
        return temp; 
    }
}
