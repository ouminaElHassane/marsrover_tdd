package com.tutofox.demo.kata.mars.palindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlaindromeTest {


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    // An empty string should be considered a palindrome.
    @Test
    public void testEmptyString() {
        Assertions.assertTrue(Palindrome.isPalindrome(""));
    }

    //  A single character string should be considered a palindrome.
    @Test
    public void testSingleCharacterString() {
        Assertions.assertTrue(Palindrome.isPalindrome("a"));
    }

    //A simple palindrome like "madam".
    @Test
    public void testSimplePalindrome() {
        Assertions.assertTrue(Palindrome.isPalindrome("madam"));
    }

    // A non-palindrome like "hello".
    @Test
    public void testNonPalindrome() {
        Assertions.assertFalse(Palindrome.isPalindrome("hello"));
    }

    // A palindrome with mixed case letters like "RaceCar" (assuming case insensitivity).
    @Test
    public void testPalindromeWithMixedCase() {
        Assertions.assertTrue(Palindrome.isPalindrome("RaceCar"));
    }

    /*
     A palindrome with spaces and punctuation like "A man, a plan, a canal, Panama!" (ignoring non-alphanumeric characters)*/
    @Test
    public void testPalindromeWithSpacesAndPunctuation() {
        Assertions.assertTrue(Palindrome.isPalindrome("A man, a plan, a canal, Panama!"));
    }


}
