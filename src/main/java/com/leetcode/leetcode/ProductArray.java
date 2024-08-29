package com.leetcode.leetcode;

public class ProductArray {
    public static void main(String[] args) {
        final int[] nums = {1, 2, 3, 4};
        final int[] result = productExceptSelf(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static int[] productExceptSelf(int[] nums) {
        final int[] result = new int[nums.length];
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = product;
            product *= nums[i];
        }
        product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= product;
            product *= nums[i];
        }


        return result;
    }
}
