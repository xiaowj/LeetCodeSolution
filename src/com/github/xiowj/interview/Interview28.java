package com.github.xiowj.interview;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/28/
 * <p>
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 示例:
 * <p>
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 * <p>
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 */
public class Interview28 {
    public void moveZeroes(int[] nums) {
        int j = 0;
        while (j < nums.length && nums[j] != 0) {
            j++;
        }
        int i, temp;
        for (i = temp = j; i < nums.length; i++) {
            temp = getNextNonZero(temp + 1, nums);
            if (temp != Integer.MIN_VALUE) {
                nums[i] = nums[temp];
            } else {
                break;
            }
        }
        for (int k = i; k < nums.length; k++) {
            nums[k] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }

    private int getNextNonZero(int i, int[] nums) {
        for (int j = i; j < nums.length; j++) {
            if (nums[j] != 0) {
                return j;
            }
        }
        return Integer.MIN_VALUE;
    }
}
