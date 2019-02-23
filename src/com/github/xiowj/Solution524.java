package com.github.xiowj;

import java.util.List;

public class Solution524 {

    public String findLongestWord(String s, List<String> d) {
        String lastedLength = "";
        for (String str : d) {
            if (vaild(s, str)) {
                if (lastedLength.length() < str.length()) {
                    lastedLength = str;
                    continue;
                }
                if (lastedLength.length() == str.length() && lastedLength.compareTo(str) > 0) {
                    lastedLength = str;
                }
            }
        }
        return lastedLength;
    }

    private boolean vaild(String s, String temp) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < temp.length()) {
            if (s.charAt(i) == temp.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == temp.length();
    }
}
