import java.util.Scanner;

public class PalindromeWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a text: ");
            String text = scanner.nextLine();

            if (isPalindrome(text)) {
                System.out.println("The text is a palindrome.");
            } else {
                System.out.println("The text is not a palindrome.");
            }
        } finally {
            scanner.close();
        }
    }

    public static boolean isPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
