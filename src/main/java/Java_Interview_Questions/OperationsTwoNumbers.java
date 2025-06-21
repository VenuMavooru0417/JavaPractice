package Java_Interview_Questions;

public class OperationsTwoNumbers {
    public static int add(int num1, int num2){
        return num1 + num2;
    }
    private static int multiply(int num1, int num2){
        return num1 * num2;
    }
    private static int substract(int num1, int num2){
        return num1 - num2;
    }
    private static int devide(int num1, int num2){
        return num2 / num1;
    }
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 200;
        int sum = add(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is :" +sum);

        int multiplied = multiply(num1, num2);
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is :" +multiplied);

        int substracted = substract(num1, num2);
        System.out.println("Substraction of " + num1 + " and " + num2 + " is :" +substracted);

        float devided = devide(num1, num2);
        System.out.println("Devision of " + num1 + " and " + num2 + " is :" +devided);
    }
}
