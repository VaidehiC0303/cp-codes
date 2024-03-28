import java.util.*;

class gen_paran {
    public static void main(String[] args) {
        // Specify the number of pairs of parentheses
        int n = 3; // Change this value as needed
        
        // Call the main function to generate valid combinations of parentheses
        List<String> validCombinations = generateParentheses(n);

        // Print the valid combinations
        System.out.println("Valid combinations of parentheses for " + n + " pairs:");
        for (String combination : validCombinations) {
            System.out.println(combination);

        }
    }

    public static List<String> generateParentheses(int n) {
        List<String> validAnswers = new ArrayList<>();
        char[] currentString = new char[2 * n];

        recurse(n, n, 0, currentString, validAnswers);

        return validAnswers;
    }

    private static void recurse(int forwardParensNeeded, int backwardsParensNeeded, int currentIndex, 
                            char[] currentString, List<String> validAnswers) {
        if (forwardParensNeeded == 0 && backwardsParensNeeded == 0) {
            validAnswers.add(new String(currentString));
            return;
        }

        if (forwardParensNeeded > 0) {
            currentString[currentIndex] = '(';
            recurse(forwardParensNeeded - 1, backwardsParensNeeded, currentIndex + 1, 
                    currentString, validAnswers);
        }

        if (backwardsParensNeeded > 0 && forwardParensNeeded < backwardsParensNeeded) {
            currentString[currentIndex] = ')';
            recurse(forwardParensNeeded, backwardsParensNeeded - 1, currentIndex + 1, 
                    currentString, validAnswers);
        }
    }
}
