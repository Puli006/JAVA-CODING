import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MissingNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the number of elements in the array (between 1 and 100):");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        Set<Integer> numbersSet = new HashSet<>();

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            numbersSet.add(arr[i]);  
        }

        System.out.println("Missing numbers from 1 to 100 are:");

        for (int i = 1; i <= 100; i++) {
            if (!numbersSet.contains(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
