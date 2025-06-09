// Problem: Maximum Number of Vowels in a Substring
// Link: https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
// Pattern: sliding-window
// Topic: String
// Difficulty: Medium
// Time: O(n)
// Space: O(1)

import java.util.HashSet;
import java.util.Set;

public class MaximumNumberOfVowelsInASubstring {
   public int maxVowels(String s, int k) {

        //Step 1 : Setup window vowel count, max vowel count
        int windowVowels = 0;
        int maxVowels = 0;

        //Step 2 : Create Hashset to store the vowels
        Set<Character> vowels_set = new HashSet<>();
        vowels_set.add('a');
        vowels_set.add('e');
        vowels_set.add('i');
        vowels_set.add('o');
        vowels_set.add('u');

        //Step 3 : Count the vowels in the starting window
        for(int i = 0; i<k; i++){
            char ch = s.charAt(i);
            if(vowels_set.contains(ch)){
                windowVowels++;
            }
        }

        //Step 4 : Setup for Slide
        int startIndex = 0;
        int endIndex = k;
        maxVowels = windowVowels;

        //Step 5 : Start sliding window till we reach till the end of string
        while(endIndex < s.length()){
            char outgoing_char = s.charAt(startIndex);
            if(vowels_set.contains(outgoing_char)){
                windowVowels--;
            }

            char incoming_char = s.charAt(endIndex);
            if(vowels_set.contains(incoming_char)){
                windowVowels++;
            }

            if(windowVowels > maxVowels){
                maxVowels = windowVowels;
            }

            startIndex++;
            endIndex++;

        }

        return maxVowels;
    }
}