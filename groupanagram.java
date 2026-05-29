import java.util.*;

class Solution {

    // This function checks if two strings are anagrams
    boolean isAnagram(String a, String b) {

        // If lengths are different, they can never be anagrams
        if (a.length() != b.length())
            return false;

        // Convert first string into character array
        char[] x = a.toCharArray();

        // Convert second string into character array
        char[] y = b.toCharArray();

        // Sort characters of first string
        Arrays.sort(x);

        // Sort characters of second string
        Arrays.sort(y);

        // Compare both sorted arrays
        // If same, strings are anagrams
        return Arrays.equals(x, y);
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        // Final result list to store all anagram groups
        List<List<String>> result = new ArrayList<>();

        // Boolean array to track words already grouped
        boolean[] used = new boolean[strs.length];

        // Loop through each word one by one
        for (int i = 0; i < strs.length; i++) {

            // If this word is already grouped, skip it
            if (used[i])
                continue;

            // Create a new group for current word
            List<String> group = new ArrayList<>();

            // Add current word to the group
            group.add(strs[i]);

            // Mark this word as used
            used[i] = true;

            // Compare current word with all remaining words
            for (int j = i + 1; j < strs.length; j++) {

                // Skip words that are already grouped
                if (used[j])
                    continue;

                // Check if current word and next word are anagrams
                if (isAnagram(strs[i], strs[j])) {

                    // If yes, add word to current group
                    group.add(strs[j]);

                    // Mark that word as used
                    used[j] = true;
                }
            }

            // Add the completed group to result
            result.add(group);
        }

        // Return all anagram groups
        return result;
    }
}
