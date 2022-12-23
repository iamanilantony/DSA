// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

package Arrays;

import java.util.*;

public class kids_with_the_greatest_number_of_candies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extracandies = 3;
        List<Boolean> res = kidsWithCandies(candies, extracandies);
        System.out.println(res);
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extracandies){
        List<Boolean> result = new ArrayList<Boolean>(candies.length);
        int max = 0;
        for(int i: candies) {
            if(i > max) max = i;
        }
        for(int i=0; i< candies.length; i++){
            result.add(candies[i] + extracandies >= max);
        }
        return result;
    } 
}
