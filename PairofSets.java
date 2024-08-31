import java.util.Scanner;

public class PairofSets {

    static boolean chkPair(int A[], int size, int x) {
        for (int i = 0; i < (size - 1); i++) {
            for (int j = (i + 1); j < size; j++) {
                if (A[i] + A[j] == x) {
                    return true; 
                }
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int size = scanner.nextInt();

        int A[] = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.println("Enter the value to check for pair sum:");
        int x = scanner.nextInt();

        if (chkPair(A, size, x)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
