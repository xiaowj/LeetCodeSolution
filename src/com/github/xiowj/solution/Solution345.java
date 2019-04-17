package com.github.xiowj.solution;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution345 {
    public String reverseVowels(String s) {
        ArrayList<Character> yuan = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int i = 0;
        int j = s.length() - 1;
        char[] str = s.toCharArray();
        while (i < j) {
            while (!yuan.contains(str[i]) && i < j) {
                i++;
            }
            while (!yuan.contains(str[j]) && i < j) {
                j--;
            }
            char swap = str[i];
            str[i] = str[j];
            str[j] = swap;
            i++;
            j--;
        }
        return new String(str);
    }
}
