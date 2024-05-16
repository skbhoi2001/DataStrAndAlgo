package topic.ConditionLoop;

import java.util.Scanner;

public class ArmstrongPrintAll {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num1 = inp.nextInt();
        int num2 = inp.nextInt();

        int count = 0;

        for (int i = num1 ; i<=num2 ;i++){

            boolean status = checkArmstrong(i);
            if(status){
                count++;
                System.out.println(i + " "+ count);
            }
        }

    }

    static boolean checkArmstrong(int num) {

        int temp = num;
        int len = checkLength(temp);
        int sum = 0;

        while (temp > 0){
            int val = temp % 10;
            sum = (int) (sum + Math.pow(val,len));
            temp = temp / 10;
        }

        if(sum == num){
            return  true;
        }else{
            return false;
        }
    }


    static int checkLength(int num){
        int count = 0;
        int temp = num;

        while (temp > 0){
            count++;
            temp = temp/10;
        }
        return  count;
    }
}
