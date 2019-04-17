package com.github.xiowj.solution;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/reverse-integer/
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 */
public class Solution7 {
    public int reverse(int x) {
        if (x == 0) {
            return 0;
        } else if (x > 0) {
            char[] chars = (x+"").toCharArray();
            Stack<Character> stack = new Stack<>();
            for (char aChar : chars) {
                stack.push(aChar);
            }
            char[] result = new char[chars.length];
            for (int i = 0; i < result.length; i++) {
                result[i] = stack.pop();
            }
            try {
                return Integer.valueOf(new String(result));
            } catch (NumberFormatException e) {
                return 0;
            }
        } else {
            char[] chars = (x + "").toCharArray();
            Stack<Character> stack = new Stack<>();
            for (int i = 1; i < chars.length; i++) {
                stack.push(chars[i]);
            }
            char[] result = new char[chars.length];
            for (int i = 1; i < result.length; i++) {
                result[i] = stack.pop();
            }
            result[0] = '-';
            try {
                return Integer.valueOf(new String(result));
            } catch (NumberFormatException e) {
                return 0;
            }
        }
    }
}
