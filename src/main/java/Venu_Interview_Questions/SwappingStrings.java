package Venu_Interview_Questions;

public class SwappingStrings {
    // Using Built-In Functions...
    public static void main(String[] args) {
        String str1 = "Neeraja";
        String str2 = "Venu";
        swap(str1, str2);
        swap1(str1,str2);
    }

    // Using 3rd variable...
    public static void swap(String str1,String str2){
        System.out.println(" Before Swapping are :" + str1 + " , " + str2);
        String temp = str1;
        str1 = str2;
        str2 = temp;
        System.out.println(" After Swapping are :" + str1 + " , " + str2);
    }
    // WithOut Using 3rd variable....
    public static void swap1(String str1, String str2){
        System.out.println(" Before Swapping are :" + str1 + " , " + str2);
        str1 = str1 + str2;
        str2 = str1.substring(0,str1.length() - str2.length());
        str1 = str1.substring(str2.length());
        System.out.println(" After Swapping are :" + str1 + " , " + str2);
    }

}
