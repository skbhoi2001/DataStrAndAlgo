package topic.ConditionLoop;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Radius");
        int rad = in.nextInt();
        float pi = 3.14F;
        int area = (int) (pi * rad * rad);
        System.out.println(area);
    }
}
