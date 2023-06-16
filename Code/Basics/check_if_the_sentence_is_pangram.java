import java.lang.*;
import java.util.*;

public class check_if_the_sentence_is_pangram {

  public static void main(String[] args) {
    int A = 121;
    int x = solve(A);
    System.out.println(x);
  }

  public static int solve(int A) {
    for(int i=1;i<=A/2;i++){
        if(i*i==A){
            return i;
        }
    }
    return -1;
}
}
