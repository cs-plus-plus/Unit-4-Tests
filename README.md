# CS++ Java — Unit 4: Iteration

> **Unit 4** | 100 Points | 7 Autograded Tests

In this assignment you will use `while` loops, `for` loops, nested loops, and String traversal to solve problems. Methods in this unit are instance methods (not static), so the tests create a `Unit4` object to call them.

---

## Table of Contents

1. [Concepts You Need](#concepts-you-need)
2. [Project Overview](#project-overview)
3. [Methods to Implement](#methods-to-implement)
4. [File Structure](#file-structure)
5. [Autograding](#autograding)
6. [Try It Yourself — Practice Examples](#try-it-yourself--practice-examples)
7. [Tips for Success](#tips-for-success)
8. [FAQ](#faq)

---

## Concepts You Need

### For Loops

Use a `for` loop when you know how many times to repeat:

```java
// Print numbers 1 through 5
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}

// Sum 1 to n
int sum = 0;
for (int i = 1; i <= n; i++) {
    sum += i;
}
```

### While Loops

Use a `while` loop when you do not know how many iterations you need:

```java
int count = 1;
while (count <= 5) {
    System.out.println(count);
    count++;
}
```

### String Traversal

Use `charAt(i)` to access individual characters in a String:

```java
String word = "Hello";
for (int i = 0; i < word.length(); i++) {
    char c = word.charAt(i);
    System.out.println(c);
}
```

### Counting Vowels

Check each character against the vowels:

```java
String vowels = "aeiouAEIOU";
int count = 0;
for (int i = 0; i < str.length(); i++) {
    if (vowels.indexOf(str.charAt(i)) != -1) {
        count++;
    }
}
```

### Palindrome Check

A palindrome reads the same forward and backward:

```java
// "racecar" → palindrome
// "hello" → not a palindrome
// Compare first char with last, second with second-to-last, etc.
```

### Factorial

The factorial of `n` is `n * (n-1) * ... * 2 * 1`:

```java
// 5! = 5 * 4 * 3 * 2 * 1 = 120
// 0! = 1 (by definition)
```

### Building Strings in a Loop

```java
String result = "";
for (int i = 0; i < 3; i++) {
    result += "Ha";
}
// result is "HaHaHa"
```

### Nested Loops

A loop inside another loop:

```java
for (int row = 1; row <= 3; row++) {
    for (int col = 1; col <= 3; col++) {
        System.out.print(row * col + "\t");
    }
    System.out.println();
}
```

---

## Project Overview

You will implement seven methods in `Unit4.java`. These methods practice for loops, while loops, String traversal, and nested loops. Note that these are **instance methods** (not `static`).

---

## Methods to Implement

### 1. sumNumbers(int n)
Return the sum of all integers from 1 to `n`. If `n` is 0 or negative, return 0.

```java
sumNumbers(5)    // returns 15 (1+2+3+4+5)
sumNumbers(10)   // returns 55
sumNumbers(0)    // returns 0
```

### 2. repeatString(String str, int n)
Return the string repeated `n` times. If `n` is 0 or negative, return an empty string.

```java
repeatString("Ha", 3)    // returns "HaHaHa"
repeatString("AB", 2)    // returns "ABAB"
repeatString("Hi", 0)    // returns ""
```

### 3. findFactorial(int n)
Return the factorial of `n` (n!). `0!` is `1`.

```java
findFactorial(5)    // returns 120
findFactorial(3)    // returns 6
findFactorial(0)    // returns 1
```

### 4. countVowels(String str)
Return the number of vowels (a, e, i, o, u) in the string. The check should be case-insensitive.

```java
countVowels("Hello World")     // returns 3
countVowels("AEIOU")           // returns 5
countVowels("rhythm")          // returns 0
```

### 5. isPalindrome(String str)
Return `true` if the string is a palindrome (reads the same forward and backward). The check is case-sensitive.

```java
isPalindrome("racecar")   // returns true
isPalindrome("hello")     // returns false
isPalindrome("abba")      // returns true
isPalindrome("Racecar")   // returns false (case-sensitive)
```

### 6. printAsteriskPatterns(int n)
Print three patterns separated by blank lines. Each pattern is `n` rows. This method uses `System.out.println()` and returns void.

**Pattern 1 — Line:** `n` asterisks on one line repeated `n` times
```
*****
*****
*****
*****
*****
```

**Pattern 2 — Square:** Same as Pattern 1 (n x n grid of asterisks)

**Pattern 3 — Triangle:** Row `i` has `i` asterisks
```
*
**
***
****
*****
```

### 7. multiplicationTable(int n)
Print an `n` x `n` multiplication table. Each value is separated by a tab (`\t`). Each row ends with a newline.

```
For n = 3:
1	2	3
2	4	6
3	6	9
```

---

## File Structure

```
Unit-4-Tests/
├── pom.xml                                <-- Maven config (DO NOT MODIFY)
├── src/
│   ├── main/java/unit4/
│   │   └── Unit4.java                     <-- YOUR CODE GOES HERE
│   └── test/java/unit4/
│       └── Unit4Test.java                 <-- Tests (DO NOT MODIFY)
└── .github/
    └── workflows/
        └── classroom.yml                  <-- Autograding (DO NOT MODIFY)
```

**Edit only `Unit4.java`.**

---

## Autograding

| Test | What It Checks | Points |
|------|---------------|--------|
| testSumNumbers | Sum of 1 to n | 10 |
| testRepeatString | String repeated n times | 10 |
| testFindFactorial | n! calculated correctly | 15 |
| testCountVowels | Counts vowels (case-insensitive) | 15 |
| testIsPalindrome | Checks forward vs backward | 20 |
| testPrintAsteriskPatterns | Line, square, and triangle patterns | 15 |
| testMultiplicationTable | n x n table with tabs | 15 |

**Total: 100 points**

---

## Try It Yourself — Practice Examples

Create `Practice.java` in the same directory and run it with `javac Practice.java && java Practice`.

**Example 1 — Summing and factorial:**
```java
// Practice.java
public class Practice {
    public static void main(String[] args) {
        // Sum 1 to 10
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum 1-10: " + sum);  // 55

        // Factorial of 6
        int fact = 1;
        for (int i = 1; i <= 6; i++) {
            fact *= i;
        }
        System.out.println("6! = " + fact);  // 720
    }
}
```

**Example 2 — String traversal:**
```java
// Practice.java
public class Practice {
    public static void main(String[] args) {
        String word = "Programming";
        int vowels = 0;
        String vowelList = "aeiouAEIOU";

        for (int i = 0; i < word.length(); i++) {
            if (vowelList.indexOf(word.charAt(i)) != -1) {
                vowels++;
            }
        }
        System.out.println("Vowels in '" + word + "': " + vowels);  // 3
    }
}
```

**Example 3 — Palindrome check:**
```java
// Practice.java
public class Practice {
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));  // true
        System.out.println(isPalindrome("hello"));    // false
        System.out.println(isPalindrome("madam"));    // true
    }
}
```

**Example 4 — Nested loops (multiplication table):**
```java
// Practice.java
public class Practice {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(row * col + "\t");
            }
            System.out.println();
        }
    }
}
```

---

## Tips for Success

1. These methods are **instance methods** (not static) — the test creates a `Unit4` object to call them
2. For `countVowels`, convert each character to lowercase (or check both cases) for case-insensitive matching
3. For `isPalindrome`, compare characters from both ends moving toward the middle
4. For `printAsteriskPatterns`, use `System.out.print("*")` to print without a newline and `System.out.println()` to end a line
5. For `multiplicationTable`, use `"\t"` (tab) between values and `println()` at the end of each row
6. Always handle edge cases: `n = 0`, empty strings, `n = 1`

---

## FAQ

**Q: Why are these methods not static?**
Starting in Unit 4, you begin working with instance methods. The test creates `new Unit4()` and calls methods on the object. You do not need a constructor — just write the methods.

**Q: For `isPalindrome`, is the check case-sensitive?**
Yes. "Racecar" is NOT a palindrome because 'R' and 'r' are different characters.

**Q: For `printAsteriskPatterns`, what separates the three patterns?**
A blank line (empty `System.out.println()`) between each pattern.

**Q: What does `\t` do?**
It prints a tab character, which creates aligned columns in the multiplication table.

**Q: What should `findFactorial(0)` return?**
It should return `1`. By mathematical definition, 0! = 1.

---

View all assignments and scoring breakdowns at [csplusplus.com/maven-tests](https://csplusplus.com/maven-tests)

*CS++ — AP Computer Science A — [csplusplus.com](https://csplusplus.com)*
