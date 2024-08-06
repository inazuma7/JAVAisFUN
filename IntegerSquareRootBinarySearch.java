import java.util.Scanner;

public class IntegerSquareRootBinarySearch {

    public static int integerSqrt(int x) {
        if (x < 2) {
            return x;
        }

        int left = 1, right = x / 2;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long midSquared = (long) mid * mid;

            if (midSquared == x) {
                return mid;
            } else if (midSquared < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
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
