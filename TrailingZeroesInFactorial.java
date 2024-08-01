import java.util.Scanner;

public class TrailingZeroesInFactorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        int trailingZeroes = countTrailingZeroes(n);
        System.out.println("Number of trailing zeroes in " + n + "! is: " + trailingZeroes);
    }

    public static int countTrailingZeroes(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }
}
