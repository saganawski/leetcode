package com.leetcode.leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Palindrome Number Problem");
        final int givenNumber = 121;
        final boolean result = isPalindrome(givenNumber);
        final int testNumber = 1 /10;
        System.out.println("Test Number: " + testNumber);
        System.out.println("Result: " + result);
    }

    static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int reversed = 0;
        int original = x;
        while(x != 0){
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }
        return original == reversed;
    }

}
