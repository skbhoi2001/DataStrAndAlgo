package topic.ConditionLoop;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        int sum = 2;
        int a = 0;
        int b = 1;

        while (sum <= num){
            int temp = b;
            b = a + b;
            a = temp;
            System.out.println(b);
            sum++;
        }
    }
}
