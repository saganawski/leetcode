package com.leetcode.leetcode;

public class Palindrome {
    public static void main(String[] args) {
        final String s = "0P";

        final boolean result = isPalindrome(s);

        System.out.println(result);
    }

    private static boolean isPalindrome(String s) {
        // strip string
        // lowercase all letters
        // two pointer left and right to middle if they dont match return false other true

        String lowerCase = s.toLowerCase();
        String striped = lowerCase.replaceAll("[^a-zA-Z0-9]", "");

        if (striped.isEmpty()) return true;

        int rightIndex = striped.length() -1;

        for (int i = 0; i < striped.length(); i++) {

            char leftSide = striped.charAt(i);
            char rightSide = striped.charAt(rightIndex);

            if(leftSide != rightSide){
                return false;
            }

            rightIndex --;

        }

        return true;
    }
}

/*125. Valid Palindrome

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.



        Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
        Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.*/
