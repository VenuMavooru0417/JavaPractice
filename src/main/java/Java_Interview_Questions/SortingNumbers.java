package Java_Interview_Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(0);
        list.add(5);
        list.add(576);
        Collections.sort(list);
        System.out.println(list);

        //  Print fibonacci series...
//        int n = 10;
//        int a = 0, b = 1;
//        System.out.println(a+" "+b+" ");
//        for (int i = 2;i < n;i++){
//            int c = a+b;
//            System.out.println(c+"");
//            a = b;
//            b = c;
//        }



        // Reverse String...

//        String str = "Mavooru Venu";
//        String rev = new StringBuilder(str).reverse().toString();
//        System.out.println(rev);
//        String rev = "";
//        System.out.println(str);
//        for (int i=0;i < str.length();i++){
//            rev = str.charAt(i) + rev;
//        }
//        System.out.println(rev);
    }

}
