package com.leetcode.leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        final List<String> testArray = List.of("flower", "flow", "flight");
        final String longestCommonPrefix = findLongestCommonPrefix(testArray);
        System.out.printf("Longest Common Prefix = %s", longestCommonPrefix);

//        longestCommonPrefix.equalsIgnoreCase("fl");
    }

    private static String findLongestCommonPrefix(List<String> givenList) {
        final HashMap<String, Integer> prefixCount = new HashMap<>();
        final String firstWord = givenList.getFirst();
        final int firstWordLength = firstWord.length();
        for (int i = 0; i < firstWordLength; i++) {
            final String currentPrefix = firstWord.substring( 0, firstWordLength-i);
//            System.out.println(currentPrefix);
            prefixCount.put(currentPrefix,0);
        }
        //iterate through the rest of the list
        for (int i = 1; i < givenList.size(); i++) {
            final String targetWord = givenList.get(i);
            System.out.printf("Current word %s ", targetWord);

            for (int j = 0; j < targetWord.length(); j++) {
                final String currentPrefix = targetWord.substring(0, targetWord.length() - j);

                if(prefixCount.containsKey(currentPrefix)){
                    final Integer currentCount = prefixCount.get(currentPrefix);
                    prefixCount.put(currentPrefix, currentCount+1);
                }

            }
        }
        //add to prefix count
        // return highest number
        return Collections.max(prefixCount.entrySet(), Map.Entry.comparingByValue()).getKey();
    }


}
/*
* Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.*/