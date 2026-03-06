import java.util.*;

public class uc13PalindromeCheckerApp {

    public static void main(String[] args) {

        String str = "madam";

        // 1️⃣ Reverse String Method
        long start1 = System.nanoTime();

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        boolean result1 = str.equals(reversed);

        long end1 = System.nanoTime();

        // 2️⃣ Stack Method
        long start2 = System.nanoTime();

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        boolean result2 = true;

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                result2 = false;
                break;
            }
        }

        long end2 = System.nanoTime();

        // 3️⃣ Deque Method
        long start3 = System.nanoTime();

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        boolean result3 = true;

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                result3 = false;
                break;
            }
        }

        long end3 = System.nanoTime();

        // Results
        System.out.println("Reverse Method: " + result1);
        System.out.println("Execution Time: " + (end1 - start1) + " ns");

        System.out.println("\nStack Method: " + result2);
        System.out.println("Execution Time: " + (end2 - start2) + " ns");

        System.out.println("\nDeque Method: " + result3);
        System.out.println("Execution Time: " + (end3 - start3) + " ns");
    }
}