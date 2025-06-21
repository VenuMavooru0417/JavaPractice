package Java_Interview_Questions;

import static Java_Interview_Questions.OperationsTwoNumbers.add;

public class MultiplyTwoNumbers {
    private static int multiply(int num1, int num2){
        return num1 * num2;
    }
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 200;
        int multiplied = multiply(num1, num2);
        int sum = add(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is :" +sum);
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is :" +multiplied);
    }
}
