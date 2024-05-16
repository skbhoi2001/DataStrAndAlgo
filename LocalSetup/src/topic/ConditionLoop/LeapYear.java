package topic.ConditionLoop;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int year = inp.nextInt();

        System.out.println(year % 100);

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
