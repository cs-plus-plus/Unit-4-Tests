package unit4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Unit4Test {

    private final Unit4 unit4 = new Unit4();

    @Test
    public void testSumNumbers() {
        assertEquals(15, unit4.sumNumbers(5)); // Sum of 1 to 5
        assertEquals(0, unit4.sumNumbers(0)); // Edge case: sum of 0
        assertEquals(1, unit4.sumNumbers(1)); // Single number
        assertEquals(5050, unit4.sumNumbers(100)); // Larger number
    }

    @Test
    public void testRepeatString() {
        assertEquals("hellohellohello", unit4.repeatString("hello", 3));
        assertEquals("", unit4.repeatString("hello", 0)); // Edge case: repeat 0 times
        assertEquals("", unit4.repeatString("", 5)); // Repeating empty string
        assertEquals("test", unit4.repeatString("test", 1)); // Single repetition
    }

    @Test
    public void testFindFactorial() {
        assertEquals(120, unit4.findFactorial(5)); // Factorial of 5
        assertEquals(1, unit4.findFactorial(0)); // Edge case: factorial of 0
        assertEquals(1, unit4.findFactorial(1)); // Factorial of 1
        assertEquals(3628800, unit4.findFactorial(10)); // Larger factorial
    }

    @Test
    public void testCountVowels() {
        assertEquals(5, unit4.countVowels("aeiou")); // All vowels
        assertEquals(0, unit4.countVowels("bcdfg")); // No vowels
        assertEquals(0, unit4.countVowels("")); // Edge case: empty string
        assertEquals(3, unit4.countVowels("Hello World")); // Mixed case
        assertEquals(8, unit4.countVowels("This is a simple sentence.")); // Multiple vowels
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(unit4.isPalindrome("racecar")); // Palindrome
        assertFalse(unit4.isPalindrome("hello")); // Not a palindrome
        assertTrue(unit4.isPalindrome("")); // Edge case: empty string
        assertTrue(unit4.isPalindrome("a")); // Single character
        assertFalse(unit4.isPalindrome("RaceCar")); // Case-sensitive check
    }

    @Test
    public void testPrintAsteriskPatterns() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        unit4.printAsteriskPatterns(3);

        String expectedOutput = 
        	"***\n" + // line of 3
            "***\n" +
            "***\n" +
            "***\n" +  // Square pattern of 3x3
            "*\n" +
            "**\n" +
            "***\n";  // Right triangle pattern

        assertEquals(expectedOutput, outContent.toString());
        
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        unit4.printAsteriskPatterns(5);

        expectedOutput = 
        	"*****\n" + // line of 5
            "*****\n" +
            "*****\n" +
            "*****\n" +
            "*****\n" +
            "*****\n" +  // Square pattern of 5x5
            "*\n" +
            "**\n" +
            "***\n" + 
            "****\n" +
            "*****\n";  // Right triangle pattern

        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMultiplicationTable() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        unit4.multiplicationTable(3);

        String expectedOutput = 
            "1\t2\t3\t\n" +
            "2\t4\t6\t\n" +
            "3\t6\t9\t\n";  // Multiplication table up to 3x3

        assertEquals(expectedOutput, outContent.toString());
        
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        unit4.multiplicationTable(5);

        expectedOutput = 
                "1\t2\t3\t4\t5\t\n" +
                "2\t4\t6\t8\t10\t\n" +
                "3\t6\t9\t12\t15\t\n" +
                "4\t8\t12\t16\t20\t\n" + 
                "5\t10\t15\t20\t25\t\n";  // Multiplication table up to 5x5

            assertEquals(expectedOutput, outContent.toString());
    }
}
