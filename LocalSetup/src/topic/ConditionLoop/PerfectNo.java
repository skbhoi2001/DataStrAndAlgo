package topic.ConditionLoop;

import java.util.Scanner;

public class PerfectNo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();

        boolean check = checkPerfect(num);
        System.out.println("val" + check);
    }

     static boolean checkPerfect(int num) {

        int sum = 0;
        int tempNum = num;
        int i = 1;

        while ( i <= tempNum/2){
            if(num % i == 0){
                sum = sum + i;

            }
            i++;
        }


        return  sum == num;
    }
}
