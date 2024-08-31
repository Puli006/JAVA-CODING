public class PerfectPower {

    public static boolean isPerfectPower(int n) {
        if (n < 2) {
            return false;
        }

        // Check all possible values of b from 2 upwards
        for (int b = 2; b <= Math.log(n) / Math.log(2); b++) {
            int low = 2, high = n;

            // Binary search for the value of a
            while (low <= high) {
                int mid = (low + high) / 2;
                long power = (long) Math.pow(mid, b);

                if (power == n) {
                    return true;
                } else if (power < n) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] testNumbers = {4, 8, 9, 16, 27, 32, 64, 81, 100, 125, 144};

        for (int number : testNumbers) {
            System.out.println(number + " is a perfect power: " + isPerfectPower(number));
        }
    }
}
