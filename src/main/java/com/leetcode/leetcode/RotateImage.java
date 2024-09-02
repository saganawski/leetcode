package com.leetcode.leetcode;

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
        System.out.println(result.equals(expected) ? "Test Passed" : "Test Failed");

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    private static int[][] rotateImage(int[][] matrix) {
        int rowLength = matrix[0].length;

        // iterate through the matrix and swap the elements transposing the matrix
        int beginIndex = 1;
        for (int i = 0; i < matrix.length -1; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if(j >= beginIndex && j < matrix.length){
                    int tempTopRow = matrix[i][j];
                    int tempSwampLocation = matrix[j][i];

                    matrix[i][j] = tempSwampLocation;
                    matrix[j][i] = tempTopRow;

                }
            }
            beginIndex++;
        }

        // reverse the matrix

        return matrix;
    }
}
