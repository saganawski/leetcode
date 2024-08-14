package com.leetcode.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println("Two Sum Problem");
        final int[] givenIntArray = {2, 7, 11, 15};
        final int target = 9;
        final int[] result = twoSum(givenIntArray, target);
        System.out.println("Result: " + result[0] + " " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i< nums.length; i++){
            for(int j=i+1; j< nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
// generate generic test
    @Test
    public void testTwoSum(){
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums, target);
        assertArrayEquals(new int[]{0,1}, result);
    }

}
