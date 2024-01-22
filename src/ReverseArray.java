import java.util.Arrays;

public class ReverseArray {

    //Question 3
    //Given an array of 10 integers, copy all the elements in an another array but in reverse order
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,8,9,10};

        int[] reversedArray = reverse(numbers);

        System.out.println(Arrays.toString(reversedArray));
        System.out.println(Arrays.toString(numbers));

    }

    public static int[] reverse(int[] numbers){
        int[] tempNumbers = numbers.clone();
        int[] reversedArray = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            reversedArray[i] = tempNumbers[numbers.length - 1 - i];
        }

        return reversedArray;
    }
}
