package topic.array;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i] = inp.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
