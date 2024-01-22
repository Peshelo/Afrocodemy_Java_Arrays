public class ArraySumAndProduct {

    //Question 4
    // Write a program to find the sum and product of all elements of an array.

    public static void main(String[] args) {
        // Hard code the array
        int[] array = {2, 3, 4, 7, 2};


        int sum = calculateSum(array);
        long product = calculateProduct(array);

        // Print the results
        System.out.println("Sum of Array Elements: " + sum);
        System.out.println("Product of Array Elements: " + product);
    }

    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static long calculateProduct(int[] numbers) {
        long product = 1;
        for (int number : numbers) {
            product *= number;
        }
        return product;
    }
}
