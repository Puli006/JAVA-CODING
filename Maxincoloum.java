import java.util.*;

public class Maxincoloum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int m = sc.nextInt();
        
        int a[][] = new int[n][m];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        for (int j = 0; j < m; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
            System.out.println("Max in column " + j + ": " + max);
        }
    }
}
