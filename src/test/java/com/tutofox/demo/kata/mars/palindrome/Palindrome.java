package com.tutofox.demo.kata.mars.palindrome;

public class Palindrome {
    private String text;

    public static  boolean isPalindrome( String text) {
        if (text == null){
            return false;
        }else if (text.length()==1) {
            return true;
        }else{
            String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            int left = 0;
            int right = cleanedText.length() - 1;

            while (left < right) {
                if (cleanedText.charAt(left)!= cleanedText.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
}
