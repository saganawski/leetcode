package com.leetcode.leetcode;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3,},
                {4, 5, 6,},
                {7, 8, 9}
        };
        final int[][] result = rotateImage(matrix);

        final int[][] expected = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };
        // print if the result is equal to the expected result
        System.out.println(Arrays.deepEquals(result, expected) ? "Test Passed" : "Test Failed");

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    private static int[][] rotateImage(int[][] matrix) {
        // iterate through the matrix and swap the elements transposing the matrix

        // 1) track beginning index and increment it
        // 2) loop through the matrix to each row
        // 3) loop through each row
        // 4) swap the elements
        
        
        int beginIndex = 1;
        for (int i = 0; i < matrix.length -1; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if(j >= beginIndex && j < matrix.length){
                    int tempTopRow = matrix[i][j];
                    int tempSwapLocation = matrix[j][i];

                    matrix[i][j] = tempSwapLocation;
                    matrix[j][i] = tempTopRow;

                }
            }
            beginIndex++;
        }
        // 1) loop through the matrix to each row
        // 2) loop through each row
        // 3) reverse the row by half

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length / 2; j++) {
                int temp = matrix[i][j];
                int mirrorIndex = matrix[i].length - j - 1;
//
                matrix[i][j] = matrix[i][mirrorIndex];
                matrix[i][mirrorIndex] = temp;
            }
        }
        return matrix;
    }
}
