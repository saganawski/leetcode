package com.leetcode.leetcode;

import java.util.Map;

public class StringSubsequence {
    public static void main(String[] args) {
        final String s = "abc";
        final String t = "ahbgdc";
        final boolean result = isSubsequence(s, t);
        System.out.println("Result: " + result);

        System.out.println(result ? "Test Passed" : "Test Failed");
    }

    private static boolean isSubsequence(String s, String t) {
        if( s.isEmpty()) return true;

        int sIndex = 0;

        for (int i = 0; i < t.length(); i++) {
            final char currentChar = t.charAt(i);

            if(sIndex < s.length()){
                final char sChar = s.charAt(sIndex);
                if(currentChar == sChar){
                    sIndex++;
                }
            }

        }

        return sIndex == s.length();
    }
}
