package com.leetcode.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        final int[] given = new int[]{-1,0,1,2,-1,-4};
        final List<List<Integer>> result = threeSum(given);

        System.out.println(result.toString());
    }

    private static List<List<Integer>> threeSum(int[] nums) {

        // loop for i
        // sort then I can easiler do a 2 pointer
        // two point for sum
        // return list of matched
        final int targetSum = 0;
        final List<List<Integer>> threeSums = new ArrayList<>();

        // Sort Array
        Arrays.sort(nums);

        final int length = nums.length;


        for (int i = 0; i < length -2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates

//            if(i == nums.length -2){ break;}
            int leftIndex = i +1;
            int rightIndex = length -1;

            while(leftIndex < rightIndex){
                int sum = nums[i] + nums[leftIndex] + nums[rightIndex];

                if(sum == 0){
                    List<Integer> matched3sum = List.of(nums[i], nums[leftIndex], nums[rightIndex]);
                    threeSums.add(matched3sum);

                    leftIndex++;
                    rightIndex--;

                    while (leftIndex < rightIndex && nums[leftIndex] == nums[leftIndex - 1])   leftIndex++;
                    while (leftIndex < rightIndex && nums[rightIndex] == nums[rightIndex + 1]) rightIndex--;


                }else if(sum > 0){
                    rightIndex--;
                }else{
                    leftIndex++;
                }

            }

        }

        return threeSums;
    }
}



/*Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.



Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.*/
