public class Snakepattern {
    public static void main(String[] args) {
        int n = 5, m = 1;
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = m++;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    a[i][j] = m++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
