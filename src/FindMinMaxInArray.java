public class FindMinMaxInArray {
    public static void main(String[] args) {

        //Question 1
        // Find largest and smallest elements of an array. N.B. hard code the array

        //Hard code the array
        int[] array = {10, 5, 8, 3, 15, 7};

        // Initialize variables to store the largest and smallest elements
        int largest = array[0];
        int smallest = array[0];

        // Iterate through the array to find the largest and smallest elements
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            } else if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        // Print the results
        System.out.println("Largest Element: " + largest);
        System.out.println("Smallest Element: " + smallest);
    }
}