# Unit 4: Iteration

AP Computer Science A

## Overview

This project covers **Unit 4: Iteration** concepts including `while` loops, `for` loops, nested loops, and `String` traversal. Implement the 7 methods in `Unit4.java` and run the provided JUnit tests to verify your work.

## Getting Started

### Option 1: GitHub Codespaces (Recommended)

1. Click the green **Code** button on this repository
2. Select the **Codespaces** tab
3. Click **Create codespace on main**
4. Wait for the environment to build (~2 minutes the first time)
5. Start coding in `src/main/java/unit4/Unit4.java`

> **Note:** If the Java extension shows errors on first load, press `Cmd+Shift+P` (Mac) or `Ctrl+Shift+P` (Windows) and run **"Developer: Reload Window"**. This is a one-time setup step.

### Option 2: Local Development

1. Accept the assignment via the GitHub Classroom link
2. Clone the repository using GitHub Desktop
3. Open the project in your IDE (VS Code, IntelliJ, or Eclipse)
4. **Requirements:** Java 17+, Maven 3.x

## Running Tests

### In VS Code / Codespaces

Click the green play button next to any test method in `Unit4Test.java`, or open the **Testing** sidebar (beaker icon).

### Command Line

Run all tests:
```
mvn test
```

Run a single method's tests:
```
mvn -Dtest=Unit4Test#testSumNumbers test
```

## Scoring

| # | Method | Points | Concepts |
|---|--------|--------|----------|
| 1 | `sumNumbers(int n)` | 10 | `for` loop, accumulator pattern |
| 2 | `repeatString(String str, int n)` | 10 | `for` loop, String concatenation |
| 3 | `findFactorial(int n)` | 15 | `for` loop, multiplication accumulator |
| 4 | `countVowels(String str)` | 15 | `for` loop, `charAt()`, conditionals |
| 5 | `isPalindrome(String str)` | 20 | `for` loop, `charAt()`, String comparison |
| 6 | `printAsteriskPatterns(int n)` | 15 | Nested loops, `System.out.print()` |
| 7 | `multiplicationTable(int n)` | 15 | Nested loops, `System.out.print()` |
| | **Total** | **100** | |

## Method Details

### 1. `sumNumbers(int n)` — 10 points
Returns the sum of all integers from 1 to n (inclusive).
- `sumNumbers(5)` → `15`
- `sumNumbers(1)` → `1`
- `sumNumbers(0)` → `0`

### 2. `repeatString(String str, int n)` — 10 points
Returns the string repeated n times.
- `repeatString("hello", 3)` → `"hellohellohello"`
- `repeatString("hello", 0)` → `""`

### 3. `findFactorial(int n)` — 15 points
Returns n! (n factorial).
- `findFactorial(5)` → `120`
- `findFactorial(0)` → `1`

### 4. `countVowels(String str)` — 15 points
Counts vowels (a, e, i, o, u) in the string — both upper and lowercase.
- `countVowels("Hello World")` → `3`
- `countVowels("aeiou")` → `5`

### 5. `isPalindrome(String str)` — 20 points
Checks if a string reads the same forwards and backwards. **Case-sensitive!**
- `isPalindrome("racecar")` → `true`
- `isPalindrome("RaceCar")` → `false`

### 6. `printAsteriskPatterns(int n)` — 15 points
Prints three patterns using `System.out.print()` with `\n` for newlines:
1. A single line of n asterisks
2. An n × n square of asterisks
3. A right triangle with n rows (right angle at bottom-left)

### 7. `multiplicationTable(int n)` — 15 points
Prints an n × n multiplication table. Each number is followed by a tab (`\t`), each row ends with `\n`.

## Common Mistakes

- Initializing an accumulator at the wrong value (`sum = 1` instead of `sum = 0`, or `product = 0` instead of `product = 1`)
- Off-by-one errors in loop bounds (`<` vs `<=`)
- Using `println()` instead of `print()` with `\n` for the pattern methods
- Forgetting that `String.charAt()` returns a `char`, not a `String`
- Not handling edge cases (empty strings, n = 0)
- Infinite loops from forgetting to update the loop variable

## Autograding

Your code is automatically graded when you push to GitHub. Check the **Actions** tab to see your score. Each method is tested independently — you earn points for each method you complete correctly.

## Contact

For questions, contact [kevin@csplusplus.com](mailto:kevin@csplusplus.com)
