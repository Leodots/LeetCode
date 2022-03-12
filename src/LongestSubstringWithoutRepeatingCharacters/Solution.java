package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

class Solution {

    public int lengthOfLongestSubstring(String s) {

        Set<Character> hash = new HashSet<>();
        int max = 0;
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int l = i; l < s.length(); l++) {
                if (hash.contains(s.charAt(l))) {
                    hash.clear();
                    counter = 0;
                    break;
                }
                hash.add(s.charAt(l));
                counter++;
                if (counter > max) max = counter;
            }
        }
        return max;
    }
}
