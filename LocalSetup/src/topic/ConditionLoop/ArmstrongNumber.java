package topic.ConditionLoop;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        boolean status = checkArmstrong(num);
        System.out.println(status);
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
