// https://leetcode.com/problems/richest-customer-wealth

package Arrays;

import java.util.Arrays;

public class Richest_Customer_Wealth {
    public static void main(String[] args) {
        int[][] array = {{1,2,5}, {4,2,1}};
        // System.out.println(maximumWealth(array));
        maximumWealth2(array);
        // System.out.println(maximumWealth2(array));
    }
    public static int maximumWealth(int[][] accounts) {
        int count = 0; 
        for(int[] sum : accounts){
            int temp = 0;
            for(int i: sum){
                temp += i;
            }
        count = Math.max(temp, count);
        }
        return count;
}

    public static int maximumWealth2(int[][] accounts) {
        int count = 0; 
        for(int[] account : accounts){
            count = Math.max(Arrays.stream(account).sum(), count);
        }
        return count;
    }

}
