public class Numberspattern {
    public static void main(String[] args){
        int rows = 4;  // Number of rows in the triangle

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print("  ");
            }
            
            // Print the ascending numbers of the palindrome
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            
            // Print the descending numbers of the palindrome
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            
            // Move to the next line
            System.out.println();

    }
    
}
}
