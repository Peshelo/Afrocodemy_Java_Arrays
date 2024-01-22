import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};

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
