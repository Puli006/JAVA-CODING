public class Maxofarray {
    public static void main(String[] args) {
        int a[][] = {{1, 4, 5, 6}, {4, 6, 8, 45}};
        int max = Integer.MIN_VALUE;  // Use max instead of min
        int min = Integer.MAX_VALUE;
        
        // Iterate over the actual dimensions of the array
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
                if(a[i][j] < min){
                    min = a[i][j];
                }
            }
        }
        System.out.println("max "+max);
        System.out.println("min "+min);
    }
}
