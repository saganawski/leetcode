package com.leetcode.leetcode;

public class ClosestZero {
    public static void main(String[] args) {
        final int[] givenArray = {2,1,1,-1,100000};
        final  int result = findClosestZero(givenArray);
        System.out.println("Result: " + result);

    }

    private static int findClosestZero(int[] givenArray) {
        // create two temp variables to store the current closest number and the current closest difference
        int closestNumber = givenArray[0];
        int closestDifference = Math.abs(givenArray[0] - 0);

        // iterate through the array
        for (int i = 0; i < givenArray.length; i++) {
            int currentNumber = givenArray[i];

            int currentDifference = Math.abs(currentNumber - 0);
            System.out.println("Current Difference: " + currentDifference);

            if(currentDifference < closestDifference ){
                closestDifference = currentDifference;
                closestNumber = currentNumber;
            }
            if(currentDifference == closestDifference && currentNumber > closestNumber){
                closestNumber = currentNumber;
            }

        }

        return closestNumber;
    }
}
