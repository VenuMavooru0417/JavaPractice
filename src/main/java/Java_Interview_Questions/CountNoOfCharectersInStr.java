package Java_Interview_Questions;

public class CountNoOfCharectersInStr {
    public static void main(String[] args) {
        String str = "MAVOORU VENU";
        String str_without_spaces = str.replace(" ","");
        int count = 0;
        // converting String to char array through loop ..
        for (int i = 0; i < str.length(); i++){
            count++;
        }
        System.out.println("String is : " +str);
        System.out.println("No.Of Charecters in str is : " +count);
    }
}
