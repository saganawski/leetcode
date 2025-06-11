package com.leetcode.leetcode;

public class ReverseString {
    public static void main(String[] args) {
        final char[] s = new char[]{'H','a','n','n','a','h'};

        reverseString(s);

        System.out.println(s);

    }

    private static void reverseString(char[] s) {

        final int size = s.length;
        int rightIndex = size -1;
        final int midPoint = size /2;

        for (int i = 0; i < size; i++) {
            char tempValue = s[i];
            s[i] = s[rightIndex-i];
            s[rightIndex -i] = tempValue;

            if((rightIndex -i)  == midPoint){
                break;
            }

        }

    }
}


/*
344. Reverse String
Easy
        Topics
premium lock icon
        Companies
Hint
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.



Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]*/
