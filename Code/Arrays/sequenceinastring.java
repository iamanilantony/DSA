package Arrays;

public class sequenceinastring {
    public static void main(String[] args) {
        String test = "GGGTGANAGGJGAG";
        int m = Solution(test);
        System.out.println(m);
    }

    public static int Solution(String A){
        int pair = 0;
        int count = 0;
        for(int i=0;i<A.length()-1;i++){
            if (A.charAt(i) == 'A') {
                count++;
            }
            if (A.charAt(i) == 'G') {
                pair+=count;
            }
        }
        return pair;
    }
}
