package Venu_Interview_Questions;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World !.";
        reverse(str);
        String str1 = "INDIA";
        reversed(str1);
    }
    // Using Built-In Functions in Java...
    public static void reverse(String str){
        System.out.println("Original String is : " +str);
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed String is : " +reversed);
    }
    // WithOut Using Built-In Functions...
    public static void reversed(String str1){
        System.out.println("Original String is : " +str1);
        char[] charArray = str1.toCharArray();
        String reversed = "";
        for (int i = charArray.length-1; i >=0 ; i--) {
            reversed += charArray[i];
        }
        System.out.println("Reversed String is : " +reversed);
    }

}
