package com.github.xiowj.interview

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/30/
 *
 *
 * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
 *
 *
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 */
class Interview30 {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val horizon = Array(9) { BooleanArray(9) }
        val vertail = Array(9) { BooleanArray(9) }
        val cell = Array(9) { BooleanArray(9) }
        for (i in 0..8) {//横向
            for (j in 0..8) {//纵向
                if (board[i][j] == '.') {
                    continue
                }
                if (horizon[j][Character.digit(board[i][j], 10) - 1]) {
                    return false
                } else {
                    horizon[j][Character.digit(board[i][j], 10) - 1] = true
                }
                if (vertail[i][Character.digit(board[i][j], 10) - 1]) {
                    return false
                } else {
                    vertail[i][Character.digit(board[i][j], 10) - 1] = true
                }
                if (cell[3 * (i / 3) + j / 3][Character.digit(board[i][j], 10) - 1]) {
                    return false
                } else {
                    cell[3 * (i / 3) + j / 3][Character.digit(board[i][j], 10) - 1] = true
                }
            }
        }
        return true
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val interview30 = Interview30()
            println(
                interview30.isValidSudoku(
                    arrayOf(
                        charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
                        charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
                        charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
                        charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
                        charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
                        charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
                        charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
                        charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
                        charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
                    )
                )
            )
        }
    }
}
