package topic.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Input2D {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[][] arr = new int[3][3];

        for(int row = 0 ; row < arr.length ; row++) {
            for(int col = 0; col < arr[row].length ; col++){
                 arr[row][col] = inp.nextInt();
            }
        }

        //output

//        for(int row = 0 ; row < arr.length ; row++) {
//            for(int col = 0; col < arr[row].length ; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

//        for(int row = 0 ; row < arr.length ; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        for(int[] a : arr){
                        System.out.println(Arrays.toString(a));

        }

    }
}
