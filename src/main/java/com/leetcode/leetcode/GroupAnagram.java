package com.leetcode.leetcode;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = groupAnagrams(strs);

        System.out.println(result);
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        final Map<String, List<String>> ans = new HashMap<>();

        for (String s : strs){
            char[] charArray = s.toCharArray();

            Arrays.sort(charArray);
            final String key = new String(charArray);

            ans.computeIfAbsent(key, k -> new ArrayList<>()).add(s);

        }

        return new ArrayList<>(ans.values());
    }
}


//private static List<List<String>> groupAnagrams(String[] strs) {
//    final Map<String, List<String>> ans = new HashMap<>();
//    return ans;
//}


/*
Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation:

There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
        Example 2:

Input: strs = [""]

Output: [[""]]

Example 3:

Input: strs = ["a"]

Output: [["a"]]*/
