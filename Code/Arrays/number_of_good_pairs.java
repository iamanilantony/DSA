// https://leetcode.com/problems/number-of-good-pairs/
package Arrays;

public class number_of_good_pairs {
    public static void main(String[] args) {
        int[] sums = {1,2,1,2,3,4};
        System.out.println(numIdenticalPairs1(sums));
        System.out.println(numIdenticalPairs(sums));
        
    }
    public static int numIdenticalPairs1(int[] nums) {
        int res = 0;
        for(int i=0; i < nums.length ; i++){
            for(int j=i+1; j < nums.length ; j++){
                if (nums[i] == nums[j]) res++;
            }
        }
        return res;
    }
    public static int numIdenticalPairs(int[] nums) {
        int cnt[] = new int[101], res = 0;
        for (var n: nums)
            System.out.println(cnt[n]++);
            // res = res + cnt[n]++;
            // System.out.println(res);
            // System.out.println(cnt[n]++);
        return res;
    }
}

