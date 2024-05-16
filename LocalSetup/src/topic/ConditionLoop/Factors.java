package topic.ConditionLoop;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Number:");
        int num = inp.nextInt();
        int i =1;

        while (i <= num){
            if(num % i == 0){
                System.out.println(i);
            }
            i++;
        }

    }
}
