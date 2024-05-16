package topic.ConditionLoop;

import java.util.Scanner;

public class TillEnd {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sum = 0;
        int val = 0;

        do {
            System.out.print("Enter no.");
            val = inp.nextInt();
            sum = sum + val;
            System.out.println("Sum" + sum);
        }while (val > 0);
            System.out.println("User entered 0");

    }
}
