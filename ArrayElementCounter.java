import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayElementCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        Set<Integer> commonElements = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        for (int element : array1) {
            set1.add(element);
        }

        for (int element : array2) {
            if (set1.contains(element)) {
                commonElements.add(element);
            }
        }

        System.out.println("Number of common elements: " + commonElements.size());
    }
}
