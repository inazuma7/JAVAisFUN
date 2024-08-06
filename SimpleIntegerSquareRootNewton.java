public class SimpleIntegerSquareRootNewton {

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
        int[] testValues = { 0, 1, 4, 8, 16, 25, 36, 50, 100 };

        for (int value : testValues) {
            System.out.println("The integer square root of " + value + " is: " + integerSqrt(value));
        }
    }
}
