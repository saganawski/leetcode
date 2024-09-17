package com.leetcode.leetcode;

public class RansomNote    {
    public static void main(String[] args) {
        final String ransomNote = "aa", magazine = "aab";

        final boolean result = canConstruct(ransomNote, magazine);
        System.out.println(result);

    }

    private static boolean canConstruct(String ransomNote, String magazine) {
        final StringBuilder givenString = new StringBuilder(ransomNote);

        for (int i = 0; i < magazine.length(); i++) {
            final int index = givenString.indexOf(String.valueOf(magazine.charAt(i)));
            if (index != -1) {
                givenString.deleteCharAt(index);
            }

        }
        final boolean result = givenString.length() == 0;
        return result;
    }
}
