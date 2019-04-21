package com.github.xiowj;

public class Solution941 {
    public boolean validMountainArray(int[] A) {
        if (A.length < 3) {
            return false;
        }
        int i = 0;
        int j = A.length - 1;
        while (i < A.length - 1 && A[i + 1] > A[i]) {
            i++;
        }
        while (j >= 1 && A[j] < A[j - 1]) {
            j--;
        }
        return i == j && i != 0 && j != A.length - 1;
    }
}
