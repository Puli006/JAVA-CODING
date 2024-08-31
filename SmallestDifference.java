import java.util.Arrays;

public class SmallestDifference {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 50, 40, 25};
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        int pair1 = 0, pair2 = 0;

        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff < minDiff) {
                minDiff = diff;
                pair1 = arr[i - 1];
                pair2 = arr[i];
            }
        }

        System.out.println("Pair with the smallest difference: " + pair1 + " and " + pair2);
    }
}
