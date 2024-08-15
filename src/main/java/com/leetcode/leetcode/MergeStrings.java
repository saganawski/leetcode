package com.leetcode.leetcode;

public class MergeStrings {
    public static void main(String[] args) {
        final String s1 = "abc";
        final String s2 = "pqr";
        final String result = mergeStrings(s1, s2);
        System.out.println("Result: " + result);

        System.out.println(result.equalsIgnoreCase("apbqcr") ? "Test Passed" : "Test Failed");
    }

    private static String mergeStrings(String word1, String word2) {
        final StringBuilder result = new StringBuilder();
        final int word1Length = word1.length();
        final int word2Length = word2.length();
        final int maxLength = Math.max(word1Length, word2Length);

        for (int i = 0; i < maxLength; i++) {
            if (i < word1Length) {
                result.append(word1.charAt(i));
            }
            if (i < word2Length) {
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
    }

}
