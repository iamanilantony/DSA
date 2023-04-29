package Arrays;

public class closestMinMax {
    public static void main(String[] args) {
        int[] A = {814, 761, 697, 483, 981};
        System.out.println(solve(A));
    }
    public static int solve(int[] A) {
        int min= Integer.MAX_VALUE,max = Integer.MIN_VALUE, min_index = -1, max_index = -1, ans=A.length;
        for(int i=0;i<A.length;i++){
            if(min > A[i]) min = A[i];
            if(max < A[i]) max = A[i]; 
        }
        System.out.println(min);
        System.out.println(max);
        if(min == max) return 1;
        for(int i=0;i<A.length;i++){
            if(A[i]==min){
                System.out.println(ans);
                min_index = i;
                if(max_index != -1){
                    ans = Math.min(ans,min_index - max_index + 1);
                }
            } 
            if(A[i] == max){
                max_index = i;
                System.out.println(ans);
                if(min_index != -1){
                    ans = Math.min(ans,max_index - min_index + 1);
                }
            } 
        }
        return ans;
    }
}
