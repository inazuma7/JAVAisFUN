import java.util.Scanner;

public class HappyNumber2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isHappyNumber(number)) {
            System.out.println(number + " is a happy number.");
        } else {
            System.out.println(number + " is not a happy number.");
        }
    }

    public static boolean isHappyNumber(int n) {
        int slowRunner = n;
        int fastRunner = getNext(n);
        while (fastRunner != 1 && slowRunner != fastRunner) {
            slowRunner = getNext(slowRunner);
            fastRunner = getNext(getNext(fastRunner));
        }
        return fastRunner == 1;
    }

    private static int getNext(int number) {
        int totalSum = 0;
        while (number > 0) {
            int digit = number % 10;
            number = number / 10;
            totalSum += digit * digit;
        }
        return totalSum;
    }
}
