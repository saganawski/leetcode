package com.leetcode.leetcode;

import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {
        final int[] nums = {1, 2, 3, 1};
        final boolean result = containsDuplicate(nums);
        System.out.println(result);
    }

    private static boolean containsDuplicate(int[] nums) {
        /*
         * 1) create a hashMap to keep track of the elements
         * 2) loop through the array and check if the element is in the hashMap
         * 3) if the element is in the hashMap return true
         * 4) else add the element to the hashMap
         * 5) return false
         * */
        final HashMap<Integer, Integer> elementMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(elementMap.containsKey(nums[i])){
                return true;
            }
            elementMap.put(nums[i], 0);
        }
        return false;
    }
}
