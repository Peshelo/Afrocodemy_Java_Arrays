import java.util.Arrays;

public class CheckCommonPairs {

    public static void main(String[] args) {
        int[] array1 = {1, 5, 6, 9, 8, 2, 4};
        int[] array2 = {3, 6, 2, 4};
        int[] common = findCommonElements(array1, array2);
        System.out.println(Arrays.toString(common));
    }

    private static int[] findCommonElements(int[] array1, int[] array2) {
        int[] commonElements = new int[Math.min(array1.length, array2.length)];
        int index = 0;

        for (int i = 0; i < array1.length; i++) {
            int firstNumber = array1[i];
            for (int j = 0; j < array2.length; j++) {
                int secondNumber = array2[j];
                if (firstNumber == secondNumber) {
                    commonElements[index] = firstNumber;
                    index++;
                    break; // Once a match is found, break the inner loop
                }
            }
        }

        return Arrays.copyOf(commonElements, index);
    }
}
