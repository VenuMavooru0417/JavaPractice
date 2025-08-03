package Java_Interview_Questions;

public class ReverseString {
    public static void main(String[] args) {
        String str = "INDIA";
        char[] charArray = str.toCharArray();
        String rev = "";

        for (int i = charArray.length-1;i>=0;i--){
            rev += charArray[i];
        }
        System.out.println("Original String is " +str);
        System.out.println("Reverse String is " +rev);
    }
}
