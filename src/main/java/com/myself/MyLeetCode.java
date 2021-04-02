package com.myself;

public class MyLeetCode {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        new Solution().rotate(arr, 3);
    }
}

class Solution {

    // v3
    public void rotate(int[] nums, int k) {
        if (k <= 0 || k == nums.length) {
            return;
        }

        if (k > nums.length) {
            k = k % nums.length;
        }

        int[] tmps = new int[k];
        int cnt = k;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (cnt != 0) {
                tmps[--cnt] = nums[i];
                continue;
            }

            nums[i + k] = nums[i];
        }

        for (int i = 0; i < tmps.length; i++) {
            nums[i] = tmps[i];
        }

        for (int x = 0; x < nums.length; x++) {
            System.out.print(nums[x] + " ");
        }
        System.out.println();
        for (int x = 0; x < tmps.length; x++) {
            System.out.print(tmps[x] + " ");
        }
    }


    // v2
//    public void rotate(int[] nums, int k) {
//        if (k <= 0 || k == nums.length) {
//            return;
//        }
//
//        if (k > nums.length) {
//            k = k % nums.length;
//        }
//        int[] newNums = nums.clone();
//        for (int i = 0; i < newNums.length; i++) {
//            if ((k + i) >= nums.length) {
//                nums[(k + i) % nums.length] = newNums[i];
//            } else {
//                nums[k + i] = newNums[i];
//            }
//        }
//
//        for (int x = 0; x < nums.length; x++) {
//            System.out.print(nums[x] + " ");
//        }
//        System.out.println();
//        for (int x = 0; x < nums.length; x++) {
//            System.out.print(newNums[x] + " ");
//        }
//    }

    // v1
//    public void rotate(int[] nums, int k) {
//        if (k <= 0) {
//            return;
//        }
//
//        int tmp = 0;
//        for (int j = 0; j < k; j++) {
//            for (int i = nums.length - 1; i >= 0; i--) {
//                if (i == nums.length - 1) {
//                    tmp = nums[i];
//                    continue;
//                }
//                nums[i + 1] = nums[i];
//            }
//            nums[0] = tmp;
//        }
//
//        for (int x = 0; x < nums.length; x++) {
//            System.out.print(nums[x] + " ");
//        }
//    }
}