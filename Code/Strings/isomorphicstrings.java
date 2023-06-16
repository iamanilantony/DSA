// https://leetcode.com/problems/isomorphic-strings/solution/

package Strings;

import java.util.Arrays;

public class isomorphicstrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("foo", "bar"));
    }

    public static boolean isIsomorphic(String s, String t) {
        int[] mappingDictStoT = new int[256];
        Arrays.fill(mappingDictStoT, -1);
        int[] mappingDictTtoS = new int[256];
        Arrays.fill(mappingDictTtoS, -1);

        for(int i=0; i<s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (mappingDictStoT[a] == -1 && mappingDictTtoS[b] == -1){
                mappingDictStoT[a] = b;
                mappingDictTtoS[b] = a;
            }

            
            else if(!(mappingDictStoT[a] == b) && mappingDictTtoS[b] == a){
                return false;
            }

        }
        return true;

    }
}