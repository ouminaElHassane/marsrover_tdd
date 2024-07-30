package com.tutofox.demo.kata.mars.anagram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {


    public String[] splitString(String documenting) {
        return documenting.split("\\s+");
    }

    public List<String> generateTwoWordAnagrams(String documenting) {
        String[] words = splitString(documenting);
        List<String> anagrams = new ArrayList<>();

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                String word1 = words[i].toLowerCase();
                String word2 = words[j].toLowerCase();

                if (isAnagram(word1, word2)) {
                    anagrams.add(word1 + " " + word2);
                }
            }
        }

        return anagrams;
    }

    private boolean isAnagram(String word1, String word2) {
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();

        if (chars1.length!= chars2.length) {
            return false;
        }

        for (int i = 0; i < chars1.length; i++) {
            int index = word2.indexOf(chars1[i]);
            if (index == -1) {
                return false;
            }
            word2 = word2.substring(0, index) + word2.substring(index + 1);
        }

        return true;
    }

    public List<String> generateTwoWordAnagramsRefactored(String documenting) {
        String[] words = splitString(documenting);
        List<String> anagrams = new ArrayList<>();

        for (String word1 : words) {
            for (String word2 : words) {
                if (isAnagram(word1, word2) &&!word1.equals(word2)) {
                    anagrams.add(word1 + " " + word2);
                }
            }
        }

        return anagrams;
    }

    public List<String> generateTwoWordAnagramsRefactoredAndFinal(String documenting) {
        String[] words = splitString(documenting);
        List<String> anagrams = new ArrayList<>();

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isAnagram(words[i], words[j])) {
                    anagrams.add(words[i] + " " + words[j]);
                }
            }
        }

        return anagrams.stream().distinct().collect(Collectors.toList());
    }
}
