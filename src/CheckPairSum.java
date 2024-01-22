public class CheckPairSum {

    //Question 6
    // Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number
    // e.g. if array is 3,4,5,2,6,8,0 and the specified number is 8 result is {{3,5}, {2,6}, {8,0}}

    public static void main(String[] args) {
        int[] numbers = {3,4,5,2,6,8,0};
        int sum = 8;
        findPairs(numbers, sum);
    }

    private static void findPairs(int[] numbers, int sum) {
        for (int i = 0; i < numbers.length; i++) {
            int firstNumber = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                int secondNumber = numbers[j];
                if (firstNumber + secondNumber == sum) {
                    System.out.println("{" + firstNumber + "," + secondNumber + "}");
                }
            }
        }
    }

}
