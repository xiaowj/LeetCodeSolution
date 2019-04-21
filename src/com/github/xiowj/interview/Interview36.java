package com.github.xiowj.interview;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/36/
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * <p>
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "race a car"
 * 输出: false
 */
public class Interview36 {
    public boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        int i = 0, j = chars.length - 1;
        while (i <= j) {
            //找出符合条件的字符
            while (!isDig(chars[i]) && !isLetter(chars[i]) && i < j) {
                i++;
            }
            //找出符合条件的字符
            while (!isDig(chars[j]) && !isLetter(chars[j]) && i < j) {
                j--;
            }

            if (chars[i] != chars[j]) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    private boolean isDig(char ch) {
        return ch >= '0' && ch <= '9';
    }

    private boolean isLetter(char ch) {
        return ch >= 'a' && ch <= 'z';
    }

    public static void main(String[] args) {
        Interview36 interview36 = new Interview36();
        System.out.println(interview36.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(interview36.isPalindrome("race a car"));
        System.out.println(interview36.isPalindrome(" "));
    }
}
