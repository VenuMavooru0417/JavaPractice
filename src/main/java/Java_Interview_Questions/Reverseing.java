package Java_Interview_Questions;

public class Reverseing {
    public static void main(String[] args) {
        //  Reverse Integer...
        int num = 123456;
        System.out.println("Original Number is : " + num);
        rev(num);

        // Reverse String...
        String str = "Mavooru Venu";
        revStr(str);

    }
    public static void rev(int num) {
        // Reverse Integer...
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Reverse Number is : " + rev);
    }
    public static void revStr(String str) {
        // Reverse String...


        char[] charArray = str.toCharArray();
        String rev = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            rev += charArray[i];
        }
        System.out.println(" Original String is : " + str);
        System.out.println(" Reverse String is : " + rev);
    }


}

