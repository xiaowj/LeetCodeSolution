package com.github.xiowj.interview

import java.util.Arrays

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/31/
 *
 * 给定一个 n × n 的二维矩阵表示一个图像。
 * 将图像顺时针旋转 90 度。
 * 说明：
 * 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
 */
class Interview31 {
    fun rotate(matrix: Array<IntArray>) {
        val length = matrix.size
        for (i in 0..length) {
            for (j in 0..length) {
                if (i + j >= length - 1) {
                    continue
                }
                val temp = matrix[i][j]
                matrix[i][j] = matrix[length - j - 1][length - i - 1]
                matrix[length - j - 1][length - i - 1] = temp
            }
        }
        Arrays.stream(matrix).forEach { ints -> println(Arrays.toString(ints)) }

        for (i in 0 until length / 2) {
            for (j in 0 until length) {
                val temp = matrix[i][j]
                matrix[i][j] = matrix[length - i - 1][j]
                matrix[length - i - 1][j] = temp
            }
        }
        Arrays.stream(matrix).forEach { ints -> println(Arrays.toString(ints)) }
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val interview31 = Interview31()
            interview31.rotate(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9)))
            interview31.rotate(
                arrayOf(
                    intArrayOf(5, 1, 9, 11),
                    intArrayOf(2, 4, 8, 10),
                    intArrayOf(13, 3, 6, 7),
                    intArrayOf(15, 14, 12, 16)
                )
            )
        }
    }
}
