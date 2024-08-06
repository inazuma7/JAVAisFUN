public class BinarySquareRoot {
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
        int[] testValues = { 0, 1, 4, 8, 16, 25, 36, 50, 100 };

        for (int value : testValues) {
            System.out.println("The integer square root of " + value + " is: " + integerSqrt(value));
        }
    }
}