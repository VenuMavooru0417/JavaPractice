package Venu_Interview_Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapingNumbers {
    public static void main(String[] args) {
        int num1 = 1111;
        int num2 = 2222;
        swap(num1,num2);
        int a = 10;
        int b = 20;
        swap1(a, b);

        // Using Collections...
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        System.out.println("Before Swapping: " + list);
        Collections.swap(list, 0,1);
        System.out.println("After Swapping: " + list);

    }
    // Swap two numbers using 3rd Variable...

    public static void swap(int num1, int num2){
        System.out.println(" Before Swapping are : " + num1 + " , " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(" After Swapping are : " + num1 + " , " + num2);
    }

    //  Swap two numbers WithOut using 3rd Variable...
    public static void swap1(int a,int b){
        System.out.println(" Before Swapping are : " + a + " , " + b);
        // Using Arthematical Operations...
//        a = a + b;
//        b = a - b;
//        a = a - b;

        // Uisng Multiplication & Division Operators...

        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println(" After Swapping are : " + a + " , " + b);
    }




}
