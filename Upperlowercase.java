import java.util.Scanner;

public class Upperlowercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int u = 0, l = 0, num = 0, s = 0;
        String n = scanner.nextLine();

        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            if (Character.isUpperCase(c)) {
                u++;
            } else if (Character.isLowerCase(c)) {
                l++;
            } else if (Character.isDigit(c)) {
                num++;
            } else {
                s++;
            }
        }

        System.out.println("The UpperCase letters are: " + u);
        System.out.println("The LowerCase letters are: " + l);
        System.out.println("The Digits are: " + num);
        System.out.println("The Special characters are: " + s);
    }
}
