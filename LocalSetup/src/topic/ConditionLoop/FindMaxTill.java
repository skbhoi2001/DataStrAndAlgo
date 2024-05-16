package topic.ConditionLoop;

import java.util.Scanner;

public class FindMaxTill {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int max = 0;
        int val = 0;

        do {
            System.out.print("Enter no.");
            val = inp.nextInt();
            max = Math.max(val,max);
        }while (val > 0);
        System.out.println("User entered 0 and max is" + max);
    }
}
