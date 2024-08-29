package com.leetcode.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
//        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] intervals = {{1, 4}, {0, 4}};
        int[][] result = mergeIntervals(intervals);
        for (int[] interval : result) {
            System.out.println(interval[0] + " " + interval[1]);
        }
    }

    private static int[][] mergeIntervals(int[][] intervals) {
        // create a 2d list to store the result
        final List<List<Integer>> result = new ArrayList<>();
//        int[][] result = new int[intervals.length][2];
//        System.out.println(intervals.length);
//        System.out.println(intervals[0].length);

        for (int i = 0; i < intervals.length; i++) {
            final int startingInterval = intervals[i][0];
            final int endingInterval = intervals[i][1];

            if(result.isEmpty()){
                List<Integer> interval = new ArrayList<>();
                interval.add(startingInterval);
                interval.add(endingInterval);
                result.add(interval);
            }else{
                List<Integer> lastInterval = result.get(result.size() - 1);
                int lastIntervalStart = lastInterval.get(0);
                int lastIntervalEnd = lastInterval.get(1);
                if(lastIntervalEnd <= endingInterval){
                    lastInterval.set(1, Math.max(lastIntervalEnd, endingInterval));
                }else if(lastIntervalStart > startingInterval){
                    List<Integer> interval = new ArrayList<>();
                    interval.add(startingInterval);
                    interval.add(endingInterval);
                    result.add(interval);
                }else{
                    List<Integer> interval = new ArrayList<>();
                    interval.add(startingInterval);
                    interval.add(endingInterval);
                    result.add(interval);
                }
            }



        }
        return result.stream().map(interval -> interval.stream().mapToInt(i -> i).toArray()).toArray(int[][]::new);
    }
}
/*
56. Merge Intervals
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.



Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.


        Constraints:

        1 <= intervals.length <= 104
intervals[i].length == 2
        0 <= starti <= endi <= 104


        public int[][] merge(int[][] arr) {

    int n = arr.length; // size of the array
        //sort the given intervals:
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // if the current interval does not lie in the last interval:
            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1).get(1)) {
                ans.add(Arrays.asList(arr[i][0], arr[i][1]));
            }
            // if the current interval lies in the last interval:
            else {
                ans.get(ans.size() - 1).set(1, Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]));
            //  we have to take the end value which is max from both the arrays-comparision
            }
        }
        // Convert List<List<Integer>> to int[][]
        int[][] result = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            result[i][0] = ans.get(i).get(0);
            result[i][1] = ans.get(i).get(1);
        }

        return result;

}

        */
