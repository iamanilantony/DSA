// https://leetcode.com/problems/flipping-an-image/

package Arrays;

import java.util.Arrays;

public class flipping_an_image {
    public static void main(String[] args) {
        int[][] x = { {1,1,0},{1,0,1},{0,0,0}};
        int[][] y = flipAndInvertImage(x);
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));

    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] output = new int[image[0].length][image.length];
        for(int i=0; i<image.length; i++){
            int temp = image[i].length;
            for(int j=0; j<=temp; j++){
                output[j][i] = image[temp-1][i];
                temp--;
            }
        }
        System.out.println(Arrays.toString(output));
        return output;
     }
}








// i = 0 

// x = [
//     [1,1,0],
//     [1,0,1],
//     [0,0,0],
// ]


// y = [
//     [0,1,1],
//     [1,0,1],
//     [0,0,0],
// ]

// z = [
//     [1,0,0],
//     [0,1,0],
//     [1,1,1], 
// ]
