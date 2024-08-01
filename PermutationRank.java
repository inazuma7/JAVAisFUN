import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PermutationRank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = scanner.next();
        scanner.close();

        int rank = findRank(input);
        System.out.println("The rank of the permutation is: " + rank);
    }

    private static int findRank(String str) {
        int length = str.length();
        int rank = 1;
        int factorial = factorial(length);
        Map<Character, Integer> frequencyMap = buildFrequencyMap(str);

        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            factorial /= length - i;

            for (char ch = 'a'; ch < currentChar; ch++) {
                if (frequencyMap.containsKey(ch) && frequencyMap.get(ch) > 0) {
                    rank += factorial / calculateDenominator(frequencyMap);
                }
            }

            frequencyMap.put(currentChar, frequencyMap.get(currentChar) - 1);
            if (frequencyMap.get(currentChar) == 0) {
                frequencyMap.remove(currentChar);
            }
        }

        return rank;
    }

    private static Map<Character, Integer> buildFrequencyMap(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        return frequencyMap;
    }

    private static int calculateDenominator(Map<Character, Integer> frequencyMap) {
        int denominator = 1;
        for (int freq : frequencyMap.values()) {
            denominator *= factorial(freq);
        }
        return denominator;
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
