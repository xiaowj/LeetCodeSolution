package com.github.xiowj.interview;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/34/
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * 案例:
 * s = "leetcode"
 * 返回 0.
 * s = "loveleetcode",
 * 返回 2.
 * 注意事项：您可以假定该字符串只包含小写字母。
 */
public class Interview34 {

    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int[] indexs = new int[26];
        for (int i = 0; i < chars.length; i++) {
            indexs[chars[i] - 'a']++;
        }

        for (int i = 0; i < chars.length; i++) {
            if (indexs[chars[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Interview34 interview34 = new Interview34();
        System.out.println(interview34.firstUniqChar("leetcode"));
        System.out.println(interview34.firstUniqChar("loveleetcode"));
    }

}
