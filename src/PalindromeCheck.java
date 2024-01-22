public class PalindromeCheck {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 7, 4, 3, 2};

        if (isPalindrome(array)) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int[] array) {
        int length = array.length;

        for (int i = 0; i < length / 2; i++) {
            if (array[i] != array[length - 1 - i]) {
                return false;
            }
        }

        return true;
    }
}
