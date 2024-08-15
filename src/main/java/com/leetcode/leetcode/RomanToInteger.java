package com.leetcode.leetcode;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println("Starting Roman");
        final String givenRoman = "MCMXCIV";
        final int romanIntResult = romanToInt(givenRoman);

        System.out.println("Result : " + romanIntResult);

    }
    static  public  int romanToInt(String givenRoman){
        System.out.println("givenRoman : " + givenRoman);
        // make a map of conversions values and exception cases
        final Map<String, Integer> romanConversions =  Map.of("I",1, "V", 5, "X", 10, "L", 50, "C", 100, "D",500, "M",1000);
        
        // iterate over sting adding the values of the count
        Integer totalCount  = 0;
        for (int i = 0; i < givenRoman.length(); i++) {
            final char charAt = givenRoman.charAt(i);
            final Integer currentCount = romanConversions.get(String.valueOf(charAt));

            Integer nextCount = null;
            if(i + 1 < givenRoman.length() ){
                final char nextChar = givenRoman.charAt(i +1);
                nextCount = romanConversions.get(String.valueOf(nextChar));
            }

            if(nextCount !=null && nextCount > currentCount ){
                totalCount = totalCount - currentCount;
            }else{
                totalCount = totalCount + currentCount;
            }


        }
        return totalCount;
    }
}
// Optimize by ChatGPT
/*
* public int romanToInt(String givenRoman) {
        // Initialize the map for Roman numeral conversions
        final Map<Character, Integer> romanConversions = Map.of(
                'I', 1, 'V', 5, 'X', 10, 'L', 50,
                'C', 100, 'D', 500, 'M', 1000);

        // Initialize total count
        int totalCount = 0;

        // Iterate over the string
        for (int i = 0; i < givenRoman.length(); i++) {
            // Get the current numeral value
            int currentCount = romanConversions.get(givenRoman.charAt(i));

            // Get the next numeral value if within bounds
            if (i + 1 < givenRoman.length()) {
                int nextCount = romanConversions.get(givenRoman.charAt(i + 1));

                // Apply subtraction rule
                if (nextCount > currentCount) {
                    totalCount -= currentCount;
                } else {
                    totalCount += currentCount;
                }
            } else {
                // Add the last numeral value
                totalCount += currentCount;
            }
        }

        return totalCount;
        *
        * Summary:
Methodology: Single-pass, greedy approach.
Time Complexity: O(n), where n is the length of the input string.
Space Complexity: O(1), as the space used does not grow with input size (constant space for the map and variables).
This solution effectively leverages a straightforward, efficient strategy to convert Roman numerals to integers.
    }*/