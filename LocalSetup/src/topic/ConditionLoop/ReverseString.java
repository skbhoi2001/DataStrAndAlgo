package topic.ConditionLoop;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String val = inp.next();
        String revVal = "";
        char ch;

        for (int i = 0 ;i < val.length();i++){
            ch = val.charAt(i);
            revVal = ch + revVal;
        }

        System.out.println(revVal);
    }
}
