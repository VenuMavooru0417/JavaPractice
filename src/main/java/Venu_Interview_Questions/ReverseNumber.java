package Venu_Interview_Questions;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 123;
        reverse(num);
        reversed(num);
    }
    //  WithOut Using Built-In Functions...
    public static void reverse(int num){
        System.out.println("Original Number is : " +num);
        int rev = 0;
        while (num > 0){
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Reversed Number is : " +rev);
    }

    // Using Built-In Functions...
    public static void reversed(int num){
        System.out.println("Original Number is : " +num);
        String numStr = Integer.toString(num);
        String revStr = new StringBuilder(numStr).reverse().toString();
        int rev = Integer.parseInt(revStr);

        System.out.println("Reversed Number is : " +rev);
    }
}
