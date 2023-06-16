import java.util.*;

class highest_altitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        // int x = 
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int n = 0;
        int[] alt = new int[gain.length+1]; 
        alt[0] = 0;
        for(int i=0;i<gain.length;i++){
            alt[i+1] = alt[i]+gain[i];
        }
        for(int i=0;i<alt.length;i++){
            if(n < alt[i])  n = alt[i];
        }
        return n;
    }
}