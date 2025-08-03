package Java_Interview_Questions;

public class CountNoOfDigits {
    public static void main(String[] args) {
        int num = 12345;
        int count = 0;
        int temp = num;
        while (num != 0){
            num = num / 10;
            count++;
        }
        System.out.println("Integer is : " +temp);
        System.out.println("No.Of Digits in number is : " +count);
    }
}
