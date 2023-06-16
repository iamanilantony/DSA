
package Arrays;

import java.util.Arrays;

public class check_if_the_sentence_is_pangram {
    public static void main(String[] args) {
        String sentence = "onrcsnlxckptsxffbyswujpamfltvmdoxovggepknmtacrjkkorjgvgtgaiaudspnpxkwikevmjeephhiyvnoymjwjfopovscbefecnoytjxfwasabwohqujwowmakpyuuqvgfab";
        boolean res = checkIfPangram(sentence);
        System.out.println(res);
    }
    public static boolean checkIfPangram(String sentence){
        boolean[] mark = new boolean[26];
        int index = 0;
        for(int i=0; i<sentence.length(); i++){
            if('a' <= sentence.charAt(i) && sentence.charAt(i) <='z'){
                index = sentence.charAt(i) - 'a';
            }
            mark[index] = true;
        }
        for(int i=0; i<= 25; i++){
            if(mark[i] == false) return false;
        }
        System.out.println(Arrays.toString(mark));
        return true; 
    }
}
