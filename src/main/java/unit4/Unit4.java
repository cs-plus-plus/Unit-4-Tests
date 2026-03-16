package unit4;

public class Unit4 {

    public static void main(String[] args) {
        // Test your methods here by creating an instance and calling methods
        Unit4 unit = new Unit4();
        // Example: test sumNumbers
        System.out.println("sumNumbers(5) = " + unit.sumNumbers(5));  // Expected: 15
    }

    /**
     * Calculates the sum of all integers from 1 to n (inclusive).
     * If n is 0 or negative, returns 0.
     *
     * <p>Points: 10</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>sumNumbers(5) returns 15 (1+2+3+4+5)</li>
     *   <li>sumNumbers(1) returns 1</li>
     *   <li>sumNumbers(0) returns 0</li>
     * </ul>
     *
     * <p>Hint: Use a for loop that starts at 1 and goes up to n,
     * adding each value to an accumulator variable.</p>
     *
     * @param n the upper bound (inclusive)
     * @return the sum of integers from 1 to n
     */
    public int sumNumbers(int n) {
        // TODO: Implement this method
        return 0;
    }

    /**
     * Returns a new String consisting of the given string repeated n times.
     * If n is 0 or the string is empty, returns an empty string.
     *
     * <p>Points: 10</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>repeatString("hello", 3) returns "hellohellohello"</li>
     *   <li>repeatString("test", 1) returns "test"</li>
     *   <li>repeatString("hello", 0) returns ""</li>
     * </ul>
     *
     * <p>Hint: Use a loop to concatenate the string n times.
     * Start with an empty String and add to it each iteration.</p>
     *
     * @param str the string to repeat
     * @param n   the number of times to repeat
     * @return the repeated string
     */
    public String repeatString(String str, int n) {
        // TODO: Implement this method
        return "";
    }

    /**
     * Calculates the factorial of n (written as n!).
     * The factorial of 0 is 1. The factorial of n is 1 * 2 * 3 * ... * n.
     *
     * <p>Points: 15</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>findFactorial(5) returns 120 (1*2*3*4*5)</li>
     *   <li>findFactorial(0) returns 1</li>
     *   <li>findFactorial(1) returns 1</li>
     * </ul>
     *
     * <p>Hint: Start your result at 1 (not 0!) and multiply by each
     * integer from 1 to n. Think about why starting at 0 would be wrong.</p>
     *
     * @param n the number to calculate the factorial of (n &gt;= 0)
     * @return the factorial of n
     */
    public int findFactorial(int n) {
        // TODO: Implement this method
        return 0;
    }

    /**
     * Counts the number of vowels (a, e, i, o, u) in the given string.
     * Both uppercase and lowercase vowels should be counted.
     *
     * <p>Points: 15</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>countVowels("aeiou") returns 5</li>
     *   <li>countVowels("Hello World") returns 3</li>
     *   <li>countVowels("bcdfg") returns 0</li>
     * </ul>
     *
     * <p>Hint: Loop through each character using charAt(). Convert to
     * lowercase first, then check if it equals 'a', 'e', 'i', 'o', or 'u'.</p>
     *
     * @param str the string to search
     * @return the number of vowels found
     */
    public int countVowels(String str) {
        // TODO: Implement this method
        return 0;
    }

    /**
     * Checks if the given string is a palindrome (reads the same forwards
     * and backwards). This check IS case-sensitive, so "RaceCar" is NOT
     * a palindrome but "racecar" IS.
     *
     * <p>Points: 20</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>isPalindrome("racecar") returns true</li>
     *   <li>isPalindrome("hello") returns false</li>
     *   <li>isPalindrome("RaceCar") returns false (case-sensitive!)</li>
     *   <li>isPalindrome("a") returns true</li>
     *   <li>isPalindrome("") returns true</li>
     * </ul>
     *
     * <p>Hint: Compare characters from both ends moving inward, or
     * build the reversed string and compare with equals().</p>
     *
     * @param str the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public boolean isPalindrome(String str) {
        // TODO: Implement this method
        return false;
    }

    /**
     * Prints three asterisk patterns using System.out.print() with "\n"
     * for newlines (do NOT use println).
     *
     * <p>Pattern 1: A single line of n asterisks</p>
     * <p>Pattern 2: An n x n square of asterisks</p>
     * <p>Pattern 3: A right triangle with n rows (right angle at bottom-left)</p>
     *
     * <p>Points: 15</p>
     *
     * <p>Example: printAsteriskPatterns(3) prints:</p>
     * <pre>
     * ***
     * ***
     * ***
     * ***
     * *
     * **
     * ***
     * </pre>
     *
     * <p>Hint: You need three separate sections of nested loops. The triangle
     * pattern has row i printing i asterisks (starting from 1).</p>
     *
     * @param n the size parameter for the patterns
     */
    public void printAsteriskPatterns(int n) {
        // TODO: Implement this method
    }

    /**
     * Prints a multiplication table from 1x1 up to nxn.
     * Each number should be followed by a tab character (\t).
     * Each row ends with a newline (\n). Use print(), not println().
     *
     * <p>Points: 15</p>
     *
     * <p>Example: multiplicationTable(3) prints:</p>
     * <pre>
     * 1	2	3
     * 2	4	6
     * 3	6	9
     * </pre>
     * <p>(where spaces above represent tab characters)</p>
     *
     * <p>Hint: Use nested for loops. The outer loop controls the row,
     * the inner loop controls the column. Print row * col for each cell.</p>
     *
     * @param n the size of the table (n x n)
     */
    public void multiplicationTable(int n) {
        // TODO: Implement this method
    }
}
