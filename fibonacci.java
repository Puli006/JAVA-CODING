public class fibonacci {
        public static int fibonacci(int n) {
            if (n <= 1) {
                return n;
            }
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    
        public static void main(String[] args) {
            int numberOfTerms = 10;
            System.out.println("Fibonacci Sequence:");
            for (int i = 0; i < numberOfTerms; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
    }
