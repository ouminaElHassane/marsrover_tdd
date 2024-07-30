package com.tutofox.demo.kata.mars.anagram;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AnagramTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    /*Anagram
    About this Kata
    This Kata was posted as the problem to be solved in a “self-documenting code contest”.
    The results of the code contest can be found here http://selfexplanatorycode.blogspot.com/2008/09/results.html */

//Problem Description
//Step 1
    /*Write a program that generates all two-word anagrams of the string “documenting”. You must focus on the readability
    of your code,and you must not include any kind of documentations to it.
     The goal is to create a code that everybody can read and understand easily.

    Here’s a word list you might want to use. world_list.txt*/

    /*et's outline a Test-Driven Development (TDD) approach in Java to solve the problem of generating all two-word anagrams of the string "documenting."
    TDD involves writing tests before the implementation,
    iterating through small steps of writing just enough code to pass the tests, and then refactoring.
     */


  /*  Step-by-Step TDD Approach
1. Define the Problem
    Input: The string "documenting"
    Output: All possible two-word anagrams formed using the letters of "documenting" */

    /*2.Write the First Test
          The first test will be a simple case to ensure we can split "documenting" into any two words.
    */
    @Test
    public void testGenerateTwoWordAnagrams() {
        Anagram generator = new Anagram();
        List<String> anagrams = generator.generateTwoWordAnagrams("documenting");
        Assertions.assertFalse(anagrams.isEmpty(), "Anagrams list should not be empty.");
        Assertions.assertTrue(anagrams.contains("document gin"), "Anagrams list should contain 'document gin'.");
    }

    /*3. Implement the Solution
    Now that we have the test, let's implement the solution. We'll split "documenting" into words and then generate all possible combinations of two words.
     */
    @Test
    public void testSplitString() {
        Anagram generator = new Anagram();
        String[] words = generator.splitString("documenting");
        assertArrayEquals(new String[]{"documenting", "document", "ing"}, words, "Splitting string should return expected words.");
    }

    /*4. Write the Second Test
    After implementing the solution, we'll write a test to ensure it generates all possible two-word anagrams.
     */
    @Test
    public void testGenerateAllAnagrams() {
        Anagram generator = new Anagram();
        List<String> anagrams = generator.generateTwoWordAnagrams("documenting");
        Assertions.assertEquals(12, anagrams.size(), "Anagrams list should contain 12 anagrams.");
    }

    /*5. Refactor
    After the second test passes, we'll refactor the solution to improve its readability and maintainability.
     */
    @Test
    public void testGenerateAllAnagramsRefactored() {
        Anagram generator = new Anagram();
        List<String> anagrams = generator.generateTwoWordAnagramsRefactored("documenting");
        Assertions.assertEquals(12, anagrams.size(), "Anagrams list should contain 12 anagrams.");
    }

    /*6. Repeat the Process
    We'll repeat steps 2-5 until we have implemented all the tests and refactored the solution as needed.
     */
    @Test
    public void testGenerateAllAnagramsRefactoredAndFinal() {
        Anagram generator = new Anagram();
        List<String> anagrams = generator.generateTwoWordAnagramsRefactoredAndFinal("documenting");
        Assertions.assertEquals(12, anagrams.size(), "Anagrams list should contain 12 anagrams.");
    }

    /*7. Write the Final Test
    After refactoring, we'll write the final test to ensure the solution still works correctly.
     */
    @Test
    public void testGenerateAllAnagramsRefactoredAndFinalWithFinalTest() {
        Anagram generator = new Anagram();
        List<String> anagrams = generator.generateTwoWordAnagramsRefactoredAndFinal("documenting");
        Assertions.assertEquals(12, anagrams.size(), "Anagrams list should contain 12 anagrams.");
    }

    /*8. Document the Solution
    Finally, we'll document the solution in a clear and concise manner.
     */
    @Test
    public void testDocumentSolution() {
        // No code to be written in this test.
    }


}
