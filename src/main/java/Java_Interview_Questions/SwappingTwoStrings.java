package Java_Interview_Questions;

public class SwappingTwoStrings {
    public static void str_swap(String str1, String str2){
        // Without using Temp variable...
        System.out.println("Before swapping str1 = " + str1 + " str2 = " + str2);
        str1 = str1 + str2;
        str2 = str1.substring(0,str1.length()-str2.length());
        str1 = str1.substring(str2.length());
        System.out.println("Before swapping str1 = " + str1 + " str2 = " + str2);
    }
    public static void main(String[] args) {
        String str1 = "Venu";
        String str2 = "Mavooru";
        str_swap(str1, str2);
    }
}
