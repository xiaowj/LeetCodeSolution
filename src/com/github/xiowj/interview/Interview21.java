package com.github.xiowj.interview;

/**
 * 从排序数组中删除重复项
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/21/
 */
class Interview21 {
    public int removeDuplicates(int[] nums) {
        int length = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[length]) {
                continue;
            }
            length += 1;
            nums[length] = nums[i];
        }
        return length + 1;
    }
}