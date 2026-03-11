import java.util.Stack;

public class uc5PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        String reversed = "";

        // Pop characters to reverse
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}