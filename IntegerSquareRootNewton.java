public class IntegerSquareRootNewton {

    public static int integerSqrt(int x) {
        if (x < 2) {
            return x;
        }

        // Initial approximation
        long guess = x / 2;

        while (guess * guess > x) {
            // Update the guess using Newton's method formula
            guess = (guess + x / guess) / 2;
        }

        return (int) guess;
    }

    public static void main(String[] args) {
        int[] testValues = { 0, 1, 4, 8, 16, 25, 36, 50, 100 };

        for (int value : testValues) {
            System.out.println("The integer square root of " + value + " is: " + integerSqrt(value));
        }
    }
}