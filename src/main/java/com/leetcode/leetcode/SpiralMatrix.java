package com.leetcode.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
//        final int[][] matrix = {
//                {1, 2, 3,},
//                {4, 5, 6,},
//                {7, 8, 9}
//        };
        final int[][] matrix = {
                {1, 2, 3,4},
                {5, 6,7,8},
                {9,10,11,12}
        };
/*        final int[][] matrix = {
                {1},
        };*/
        final List<Integer> result = spiralOrder(matrix);
//        final List<Integer> expected = List.of(1, 2, 3, 6, 9, 8, 7, 4, 5);
//        final List<Integer> expected = List.of(1);
        final List<Integer> expected = List.of(1, 2, 3, 4, 8, 12,11,10,9,5,6,7);
        // print if the result is equal to the expected result
        System.out.println(result.equals(expected) ? "Test Passed" : "Test Failed");
        result.forEach(System.out::println);
    }

    private static List<Integer> spiralOrder(int[][] matrix) {
        final List<Integer> result = new ArrayList<>();
        if(matrix.length == 0){
            return result;
        }
        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int columnStart = 0;
        int columnEnd = matrix[0].length - 1;

        while(rowStart <= rowEnd && columnStart <= columnEnd){
            // traverse the first row
            for (int i = columnStart; i <= columnEnd; i++) {
                result.add(matrix[rowStart][i]);
            }
            rowStart += 1;
            // traverse the last column
            for (int i = rowStart; i <= rowEnd; i++) {
                result.add(matrix[i][columnEnd]);
            }
            columnEnd -= 1;
            // traverse the last row
            if(rowStart <= rowEnd){
                for (int i = columnEnd; i >= columnStart; i--) {
                    result.add(matrix[rowEnd][i]);
                }
            }
            rowEnd -= 1;
            // traverse the first column
            if(columnStart <= columnEnd){
                for (int i = rowEnd; i >= rowStart; i--) {
                    result.add(matrix[i][columnStart]);
                }
            }
            columnStart += 1;
        }
        return result;
    }

 /*   private static List<Integer> spiralOrder(int[][] matrix) {
        final List<Integer> result = new ArrayList<>();
        *//*
        * 1) track the first row number and increase it by 1
        * 2) track the last column number and decrease it by 1
        * 3) track the last row number and decrease it by 1
        *
        * *//*
        int firstRow = 0;
        int lastColumn = matrix[0].length - 1;
        int lastRow = matrix.length - 1;
        // push all the elements in the first row into the result
        // then last column, then last row, then first column
        while (lastRow > 0){
            for (int i = 0; i < matrix.length; i++) {
                // first row
                if(i == firstRow) {
                    // minus the last element
                    for (int j = 0; j <= lastColumn; j++) {
                        result.add(matrix[i][j]);
                    }
//                firstRow += 1;
                }
                // adds the last column
                if(i > firstRow && i < lastRow){
                    result.add(matrix[i][lastColumn]);
                    lastColumn -= 1;
                }
                // last row minus the last element
                if(i == lastRow && lastRow != firstRow){
                    for (int j = matrix[i].length -1; j >= 0; j--) {
                        result.add(matrix[i][j]);
                    }
//                    lastRow -= 1;
                    firstRow += 1;
                }
            }
            lastRow -= 1;
        }

        return result;
    }*/
}
