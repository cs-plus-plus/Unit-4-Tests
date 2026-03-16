package unit4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterEach;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Unit4Test {

    private final Unit4 unit4 = new Unit4();
    private final PrintStream originalOut = System.out;

    @AfterEach
    void restoreSystemOut() {
        System.setOut(originalOut);
    }

    // ── Method 1: sumNumbers (10 points) ─────────────────────────────────────

    @Test
    @DisplayName("sumNumbers: Sum of integers from 1 to n (10 points)")
    public void testSumNumbers() {
        assertAll("sumNumbers",
            () -> assertEquals(15, unit4.sumNumbers(5),
                "sumNumbers(5) should return 15 (1+2+3+4+5)"),
            () -> assertEquals(0, unit4.sumNumbers(0),
                "sumNumbers(0) should return 0 (edge case: no numbers to sum)"),
            () -> assertEquals(1, unit4.sumNumbers(1),
                "sumNumbers(1) should return 1 (single number)"),
            () -> assertEquals(5050, unit4.sumNumbers(100),
                "sumNumbers(100) should return 5050 (tests larger input)")
        );
    }

    // ── Method 2: repeatString (10 points) ───────────────────────────────────

    @Test
    @DisplayName("repeatString: Repeat a string n times (10 points)")
    public void testRepeatString() {
        assertAll("repeatString",
            () -> assertEquals("hellohellohello", unit4.repeatString("hello", 3),
                "repeatString(\"hello\", 3) should return \"hellohellohello\""),
            () -> assertEquals("", unit4.repeatString("hello", 0),
                "repeatString(\"hello\", 0) should return empty string (edge case: 0 repetitions)"),
            () -> assertEquals("", unit4.repeatString("", 5),
                "repeatString(\"\", 5) should return empty string (repeating empty string)"),
            () -> assertEquals("test", unit4.repeatString("test", 1),
                "repeatString(\"test\", 1) should return \"test\" (single repetition)")
        );
    }

    // ── Method 3: findFactorial (15 points) ──────────────────────────────────

    @Test
    @DisplayName("findFactorial: Calculate n! (15 points)")
    public void testFindFactorial() {
        assertAll("findFactorial",
            () -> assertEquals(120, unit4.findFactorial(5),
                "findFactorial(5) should return 120 (5! = 1*2*3*4*5)"),
            () -> assertEquals(1, unit4.findFactorial(0),
                "findFactorial(0) should return 1 (0! is defined as 1)"),
            () -> assertEquals(1, unit4.findFactorial(1),
                "findFactorial(1) should return 1 (1! = 1)"),
            () -> assertEquals(3628800, unit4.findFactorial(10),
                "findFactorial(10) should return 3628800 (tests larger factorial)")
        );
    }

    // ── Method 4: countVowels (15 points) ────────────────────────────────────

    @Test
    @DisplayName("countVowels: Count vowels in a string (15 points)")
    public void testCountVowels() {
        assertAll("countVowels",
            () -> assertEquals(5, unit4.countVowels("aeiou"),
                "countVowels(\"aeiou\") should return 5 (all 5 vowels)"),
            () -> assertEquals(0, unit4.countVowels("bcdfg"),
                "countVowels(\"bcdfg\") should return 0 (no vowels)"),
            () -> assertEquals(0, unit4.countVowels(""),
                "countVowels(\"\") should return 0 (edge case: empty string)"),
            () -> assertEquals(3, unit4.countVowels("Hello World"),
                "countVowels(\"Hello World\") should return 3 (e, o, o — remember to check both upper and lowercase)"),
            () -> assertEquals(8, unit4.countVowels("This is a simple sentence."),
                "countVowels(\"This is a simple sentence.\") should return 8")
        );
    }

    // ── Method 5: isPalindrome (20 points) ───────────────────────────────────

    @Test
    @DisplayName("isPalindrome: Check if string reads same forwards and backwards (20 points)")
    public void testIsPalindrome() {
        assertAll("isPalindrome",
            () -> assertTrue(unit4.isPalindrome("racecar"),
                "isPalindrome(\"racecar\") should return true (classic palindrome)"),
            () -> assertFalse(unit4.isPalindrome("hello"),
                "isPalindrome(\"hello\") should return false"),
            () -> assertTrue(unit4.isPalindrome(""),
                "isPalindrome(\"\") should return true (edge case: empty string is a palindrome)"),
            () -> assertTrue(unit4.isPalindrome("a"),
                "isPalindrome(\"a\") should return true (single character is a palindrome)"),
            () -> assertFalse(unit4.isPalindrome("RaceCar"),
                "isPalindrome(\"RaceCar\") should return false (check is case-sensitive!)")
        );
    }

    // ── Method 6: printAsteriskPatterns (15 points) ──────────────────────────

    @Test
    @DisplayName("printAsteriskPatterns: Line, square, and triangle patterns (15 points)")
    public void testPrintAsteriskPatterns() {
        // Test with n=3
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        unit4.printAsteriskPatterns(3);

        String expected3 =
            "***\n" +       // Line of 3
            "***\n" +
            "***\n" +
            "***\n" +       // Square 3x3
            "*\n" +
            "**\n" +
            "***\n";        // Right triangle

        assertEquals(expected3, outContent.toString(),
            "printAsteriskPatterns(3) output is incorrect.\n" +
            "Expected (shown with visible newlines):\n" +
            expected3.replace("\n", "\\n\n") +
            "Your output:\n" +
            outContent.toString().replace("\n", "\\n\n") +
            "\nRemember: print 3 patterns in order — (1) a line of n asterisks, " +
            "(2) an n x n square, (3) a right triangle with n rows.\n" +
            "Use System.out.print() with \"\\n\" for newlines, NOT println().");

        // Test with n=5
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        unit4.printAsteriskPatterns(5);

        String expected5 =
            "*****\n" +       // Line of 5
            "*****\n" +
            "*****\n" +
            "*****\n" +
            "*****\n" +
            "*****\n" +       // Square 5x5
            "*\n" +
            "**\n" +
            "***\n" +
            "****\n" +
            "*****\n";        // Right triangle

        assertEquals(expected5, outContent.toString(),
            "printAsteriskPatterns(5) output is incorrect.\n" +
            "Your output for n=5 doesn't match the expected pattern.\n" +
            "Make sure your loops scale correctly with different values of n.");
    }

    // ── Method 7: multiplicationTable (15 points) ────────────────────────────

    @Test
    @DisplayName("multiplicationTable: Print n x n multiplication table (15 points)")
    public void testMultiplicationTable() {
        // Test with n=3
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        unit4.multiplicationTable(3);

        String expected3 =
            "1\t2\t3\t\n" +
            "2\t4\t6\t\n" +
            "3\t6\t9\t\n";

        assertEquals(expected3, outContent.toString(),
            "multiplicationTable(3) output is incorrect.\n" +
            "Expected a 3x3 table with tab-separated values.\n" +
            "Each number should be followed by a tab (\\t), each row ends with \\n.\n" +
            "Expected:\n" + expected3.replace("\t", "[tab]").replace("\n", "\\n\n") +
            "Your output:\n" + outContent.toString().replace("\t", "[tab]").replace("\n", "\\n\n"));

        // Test with n=5
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        unit4.multiplicationTable(5);

        String expected5 =
            "1\t2\t3\t4\t5\t\n" +
            "2\t4\t6\t8\t10\t\n" +
            "3\t6\t9\t12\t15\t\n" +
            "4\t8\t12\t16\t20\t\n" +
            "5\t10\t15\t20\t25\t\n";

        assertEquals(expected5, outContent.toString(),
            "multiplicationTable(5) output is incorrect.\n" +
            "Make sure your nested loops scale correctly with different values of n.\n" +
            "Each cell should contain row * column, followed by a tab.");
    }
}
