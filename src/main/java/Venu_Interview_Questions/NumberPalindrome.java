package Venu_Interview_Questions;

public class NumberPalindrome {
    public static void main(String[] args) {
        int num = 12321;
        int org_num = num;
        int rev = 0;
        while (num > 0){
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(rev);
        if (org_num == rev) {
            System.out.println(org_num + " is Palindrome...");
        }else {
            System.out.println(org_num + " is Not Palindrome...");
        }
    }
}
