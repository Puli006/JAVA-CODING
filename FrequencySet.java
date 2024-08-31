import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FrequencySet  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the original set:");
        int n = scanner.nextInt();
        System.out.println("Enter the elements of the original set:");
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        System.out.println("Enter the number of elements in the subset:");
        int m = scanner.nextInt();
        System.out.println("Enter the elements of the subset:");
        Set<Integer> subset = new HashSet<>();
        for (int i = 0; i < m; i++) {
            subset.add(scanner.nextInt());
        }

        boolean isSubset = true;
        for (int element : subset) {
            if (!frequencyMap.containsKey(element) || frequencyMap.get(element) == 0) {
                isSubset = false;
                break;
            }
        }

        if (isSubset) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println("Frequency of numbers in the original set:");
        for (int key : frequencyMap.keySet()) {
            System.out.println(key + ": " + frequencyMap.get(key));
        }

        scanner.close();
    }
}
