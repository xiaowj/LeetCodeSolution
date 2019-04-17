package com.github.xiowj.solution;

public class Solution633 {

    public boolean judgeSquareSum(int c) {
        if (c == 0) {
            return true;
        }
        int j = 0;
        int k = (int) Math.sqrt(c);
        while (j <= k) {
            if (j * j + k * k == c) {
                return true;
            }else
            if (j * j + k * k > c) {
                k--;
            } else {
                j++;
            }
        }
        return false;
    }
}
