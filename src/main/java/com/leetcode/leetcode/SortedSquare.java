package com.leetcode.leetcode;

import java.util.Arrays;

public class SortedSquare {
    public static void main(String[] args) {
        final int[] given = new int[]{-5,-3,-2,-1};
        final int[] result = sortedSquares(given);

        System.out.println(Arrays.toString(result));
    }

    private static int[] sortedSquares(int[] nums) {
        int length = nums.length;

        int[] sortedSquare = new int[length];

        int leftPosition = 0;
        int rightPosition = length -1;
        int position = length -1;

        while (leftPosition <= rightPosition){
            int leftSquared = nums[leftPosition] * nums[leftPosition];
            int rightSquared = nums[rightPosition] * nums[rightPosition];

            if(leftSquared > rightSquared){
                sortedSquare[position] = leftSquared;
                leftPosition ++;
            }else{
                sortedSquare[position] = rightSquared;
                rightPosition --;
            }

            position --;
        }


        return  sortedSquare;

    }

/*    private static int[] sortedSquares(int[] nums) {
        // the middle should be the 0 index
        //
        int[] sortedSquare = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int leftSide = i; // prolly dont need
            int rightSide = (nums.length - 1) - i;

            if(leftSide == rightSide){
                int middleNumSquare = nums[leftSide] * nums[leftSide];
                sortedSquare[0] = middleNumSquare;
                break;
            }

            int leftSideSquare = nums[leftSide] * nums[leftSide];
            int rightSideSquare = nums[rightSide] * nums[rightSide];

            if(leftSideSquare > rightSideSquare){
                sortedSquare[rightSide - leftSide] = leftSideSquare;
                sortedSquare[rightSide - leftSide- 1] = rightSideSquare;
            }else{
                sortedSquare[rightSide - leftSide] = rightSideSquare;
                sortedSquare[rightSide -leftSide -1] = leftSideSquare;
            }

        }
        return sortedSquare;
    }*/
}


//977. Squares of a Sorted Array
//        Easy
//Topics
//premium lock icon
//        Companies
//Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
//
//
//
//Example 1:
//
//Input: nums = [-4,-1,0,3,10]
//Output: [0,1,9,16,100]
//Explanation: After squaring, the array becomes [16,1,0,9,100].
//        After sorting, it becomes [0,1,9,16,100].
//Example 2:
//
//Input: nums = [-7,-3,2,3,11]
//Output: [4,9,9,49,121]