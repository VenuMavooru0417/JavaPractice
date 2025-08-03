package Venu_Interview_Questions;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 200;
        sum(num1,num2);
        difference(num1,num2);
        multiply(num1,num2);
        division(num1,num2);

    }
    public static void sum(int num1, int num2){
        System.out.println(num1 + num2);

    }
    public static void difference(int num1, int num2){
//        System.out.println(num2 - num1);
        System.out.println(num1 - num2);
    }
    public static void multiply(int num1, int num2){
        System.out.println(num2 * num1);
    }
    public static void division(int num1, int num2){
//        System.out.println(num1 / num2);
        System.out.println(num2 / num1);
        System.out.println(num2 % num1);
    }
}
