package com.github.xiowj;

public class Interview27 {

    public int[] plusOne(int[] digits) {
        int[] temp = new int[digits.length + 1];
        System.arraycopy(digits, 0, temp, 1, digits.length);
        for (int i = temp.length - 1; i >= 0; i--) {
            if (temp[i] + 1 >= 10) {
                temp[i] = temp[i] + 1 - 10;
            } else {
                temp[i] = temp[i] + 1;
                break;
            }
        }
        int[] result;
        if (temp[0] == 0) {
            result = new int[temp.length - 1];
            System.arraycopy(temp, 1, result, 0, result.length);
        } else {
            result = temp;
        }
        return result;
    }

}
