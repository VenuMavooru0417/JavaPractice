package Venu_Interview_Questions;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "MADAM";
        palindrome(str);
    }
    public static void palindrome(String str){
        System.out.println(str);
        char[] charArray = str.toCharArray();
        String rev = "";
        for (int i = charArray.length-1; i >= 0 ; i--) {
            rev += charArray[i];
        }
        System.out.println(rev);
        if (rev.equals(str)) {
            System.out.println(str + " Is palindrome...");
        }else {
            System.out.println(str + " Is not palindrome...");
        }

    }
}
