package Java_Interview_Questions;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SumOfTwoDigitsInNumber {
    public static void main(String[] args) {
        int num = 12345;
        sum(num);
        sum1(num);
    }
    public static void sum(int num){
        // Sum Of First and Last Digit....
        int lastDigit = num % 10;
        int firstDigit = num;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        int sum = firstDigit + lastDigit;
        System.out.println(sum);
    }
    // Sum Of First and Middle Digit......
    public static void sum1(int num){

        int mid_digit = num % 10;
        int fir_digit = num;
        while (fir_digit >= 10){
            fir_digit /= 10;
        }
        int sum1 = fir_digit + mid_digit;
        System.out.println(sum1);
        }

    }


