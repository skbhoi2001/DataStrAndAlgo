package topic.ConditionLoop;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();

        int reverse = revereseNum(num);

        if(reverse == num){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

     static int revereseNum(int num) {

        int rev = 0;
        while (num > 0){
            rev = rev * 10 + num%10;
            num = num/10;
        }

        return  rev;

    }
}
