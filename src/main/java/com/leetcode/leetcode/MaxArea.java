package com.leetcode.leetcode;

public class MaxArea {
    public static void main(String[] args) {
        final int[] height = new int[]{1,8,6,2,5,4,8,3,7};
//        final int[] height = new int[]{1,1};
        final int result = maxArea(height);
        System.out.println(result);
    }

    private static int maxArea(int[] height) {
        //Brute force
        //largest area updated when larger area found

        //double loop
        // area = height * (h[1] - h[8] == 7) // distance between poistions in array
        //
    /*    for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int leftVal = height[i];
                int rightVal = height[j];

                int length  = j -i ;

                int currentArea = Math.min(leftVal,rightVal) * length;

                if(currentArea > maxArea) maxArea = currentArea;

            }
        }*/
        int maxArea = 0;

        int rightIndex = height.length -1;
        int leftIndex = 0;

        while(leftIndex < rightIndex){
            int leftVal = height[leftIndex];
            int rightVal = height[rightIndex];

            int length  = rightIndex -leftIndex;

            int currentArea = Math.min(leftVal,rightVal) * length;

            if(currentArea > maxArea) maxArea = currentArea;

            if(leftVal < rightVal){
                leftIndex++;
            }else{
                rightIndex--;
            }


        }



        return maxArea;
    }
}

/*11. Container With Most Water
Medium
        Topics
premium lock icon
        Companies
Hint
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.



Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1*/
