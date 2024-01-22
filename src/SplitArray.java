import java.util.Arrays;

public class SplitArray {



    public static void main(String[] args) {
        //58	24	13	15	63	9	8	81	1	78
        int[] numbers = {58, 24, 13, 15, 63, 9, 8, 81, 1, 78};
        int[] firstHalf = new int[numbers.length / 2];
        int[] secondHalf = new int[numbers.length / 2];

        splitArray(numbers, firstHalf, secondHalf);

        System.out.println("First Half: " +Arrays.toString(firstHalf));
        System.out.println("Second Half: " + Arrays.toString(secondHalf));
    }

    private static void splitArray(int[] numbers, int[] firstHalf, int[] secondHalf) {
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length / 2) {
                firstHalf[i] = numbers[i];
            } else {
                secondHalf[i - numbers.length / 2] = numbers[i];
            }
        }

    }
}
