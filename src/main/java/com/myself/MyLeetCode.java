package com.myself;

public class MyLeetCode {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 6};
        int length = new Solution().removeDuplicates(arr);
        System.out.println("length: " + length);

        for (int x = 0; x < length; x++) {
            System.out.print(arr[x] + " ");
        }
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 1) {
            return 1;
        }

        int curIdx = 0;
        for (int i = 0; i < nums.length; i++) {

            if (i + 1 == nums.length) {
                nums[curIdx] = nums[nums.length - 1];
                continue;
            }

            if (!(nums[i + 1] == nums[i])) {
                nums[curIdx] = nums[i];
                curIdx += 1;
            }


        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println();

        return curIdx + 1;
    }
}