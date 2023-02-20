package Scalar;

import java.lang.*;
import java.util.*;

public class oddOrEven {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int times = sc.nextInt();
            while(times != 0) {
                int count = sc.nextInt();
                int[] array = new int[count];
                for(int i = 0; i<count; i++){
                    array[i] = sc.nextInt();
                }
                for(int i = 0; i<count; i++){
                    if(array[i]%2 == 0) {
                        System.out.print(array[i]);
                    }
                }
                System.out.println('\n');
                for(int i = 0; i<count; i++){
                    if(array[i]%2 == 1) {
                        System.out.print(array[i]);
                    }
                }
            }
            
        }
}
