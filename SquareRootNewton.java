
import java.util.Scanner;

public class SquareRootNewton {

    public static int integerSqrt(int x) {
        if (x < 2) {
            return x;
        }

        long guess = x; // Start with x as the initial guess

        while (guess * guess > x) {
            guess = (guess + x / guess) / 2;
        }

        return (int) guess;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            int sqrt = integerSqrt(number);
            System.out.println("The integer square root of " + number + " is: " + sqrt);
        }

        scanner.close();
    }
}