package com.leetcode.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        final int[] nums = new int[]{2,2,1,1,1,2,2};
        final int result = majorityElement(nums);
        System.out.printf("Result : %d ", result);
    }

    private static int majorityElement(int[] nums) {
        final int threshold = nums.length /2;
        final Map<Integer, Integer> numOccurrenceCount = new HashMap<>();

        for(int num : nums){
            // add num to map
            // if present increment occurrence count
            // if that num > threshold return key
            final Integer currentCount = numOccurrenceCount.getOrDefault(num, 0) +1;

            if(currentCount > threshold){
                return num;
            }

            numOccurrenceCount.put(num, currentCount);

        }
        return 0;
    }
}
/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2


Constraints:

n == nums.length
1 <= n <= 5 * 104
        -109 <= nums[i] <= 109*/
