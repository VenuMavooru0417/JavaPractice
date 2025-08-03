package Venu_Interview_Questions;

public class FindLargestNumber {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 25, 8, 15, 3};
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max){
                max = numbers[i];
            }if (numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
