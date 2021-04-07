package com.myself;

public class MyLeetCode {
    public static void main(String[] args) {
        String arr = "hello";
        new Solution().reverseString(arr.toCharArray());
    }
}

class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char box = s[s.length-(1+i)];
            s[s.length-(1+i)] = s[i];
            s[i] = box;
        }

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
    }
}