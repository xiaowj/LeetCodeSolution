package com.github.xiowj.interview;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/35/
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
 * 示例 1:
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * <p>
 * 示例 2:
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 说明:
 * 你可以假设字符串只包含小写字母。
 */
public class Interview35 {
    public boolean isAnagram(String s, String t) {
        char[] chars1 = s.toCharArray();
        char[] chars = t.toCharArray();
        int[] index = new int[26];

        for (char c : chars1) {
            index[c - 'a']++;
        }

        for (char aChar : chars) {
            index[aChar - 'a']--;
        }
        for (int value : index) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Interview35 interview35 = new Interview35();
        System.out.println(interview35.isAnagram("anagram", "nagaram"));
        System.out.println(interview35.isAnagram("rat", "car"));
    }
}
