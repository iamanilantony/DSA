package Arrays;

import java.util.Arrays;

public class array_rotate {

  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5,6};
    int k = 3;
    System.out.println(Arrays.toString(rotateArray(nums, k)));
  }

  public static int[] rotateArray(int[] nums, int k) {
    int x = 0;
    while (x < k) {
    int temp = nums[nums.length-1];
    System.out.println(nums.length);
    for (int i = nums.length-1; i > 0; i--) {
        System.out.println(i);
        nums[i] = nums[i-1];
      }
      nums[0] = temp;
      x++;
    }
    System.out.println(Arrays.toString(nums));
    return nums;
  }
}
