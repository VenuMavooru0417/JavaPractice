package Java_Interview_Questions;

public class SumOfDigitsInNumber {
    public static void main(String[] args) {
        int num = 123456;
        System.out.println("Number is : " +num);
        add(num);
    }
    public static void add(int num){
        int sum = 0;
//        int temp = num;
        while (num > 0){
            sum = sum + num % 10;
            num = num / 10;
        }
//        System.out.println("Number is : " +temp);
        System.out.println("Sum Of Digits In Number is : " +sum);
    }
}
