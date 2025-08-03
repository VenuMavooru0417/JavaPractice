package Java_Interview_Questions;



public class SumOfFirstAndLastDigits {
    public static void main(String[] args) {
        int num = 1234;
        int ld = num % 10;
        int fd = num;
        while (fd >= 10){
            fd /= 10;
        }
        int sum = fd + ld;
        System.out.println(sum);
    }
}
