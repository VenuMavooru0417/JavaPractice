package Java_Interview_Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwappingTwoNumbers {
    private static void swap(int a, int b){
        //  Using temp variable..
//        System.out.println(" Before Swapping " + a + " and " + b + " Values");
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println(" After Swapping " + a + " and " + b + " Values");
        // Without using temp/third variable...
//        System.out.println(" Before Swapping " + a + " and " + b + " Values");
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        System.out.println(" After Swapping " + a + " and " + b + " Values");

        // Using mathematical operators...
//        System.out.println(" Before Swapping " + a + " and " + b + " Values");
//        a = a * b;
//        b = a / b;
//        a = a / b;
//        System.out.println(" After Swapping " + a + " and " + b + " Values");

        // Using Collections..
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        System.out.println("Before Swapping: " + list);
        Collections.swap(list, 0, 1);
        System.out.println("After Swapping: " + list);
    }
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        swap(a,b);

    }
}
