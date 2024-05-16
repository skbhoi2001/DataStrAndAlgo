package topic.ConditionLoop;

import java.util.Scanner;

public class ProdSum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num1 = inp.nextInt();
        int num2 = inp.nextInt();

        int sum = num1 + num2;
        int prod = num1 * num2;

        int diff = prod - sum;

        System.out.println(diff);

    }
}
