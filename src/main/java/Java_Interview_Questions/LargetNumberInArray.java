package Java_Interview_Questions;

public class LargetNumberInArray {
    public static void main(String[] args) {
//        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int[] numbers = {2,5,10,1,366,55};
        int largest = numbers[0];
        int smallest = numbers[1];
        for (int i = 1;i < numbers.length;i++){
            if (numbers[i]>largest){
                largest = numbers[i];
            }if (numbers[i]<smallest){
                smallest = numbers[i];
            }
        }
        System.out.println("Largest Number in Array is :" +largest);
        System.out.println("Smallest Number in Array is :" +smallest);
    }

}
