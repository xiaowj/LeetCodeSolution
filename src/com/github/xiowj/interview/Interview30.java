package com.github.xiowj.interview;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/30/
 * <p>
 * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
 * <p>
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 */
public class Interview30 {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] horizon = new boolean[9][9];
        boolean[][] vertail = new boolean[9][9];
        boolean[][] cell = new boolean[9][9];
        for (int i = 0; i < 9; i++) {//横向
            for (int j = 0; j < 9; j++) {//纵向
                if (board[i][j] == '.') {
                    continue;
                }
                if (horizon[j][Character.digit(board[i][j], 10) - 1]) {
                    return false;
                } else {
                    horizon[j][Character.digit(board[i][j], 10) - 1] = true;
                }
                if (vertail[i][Character.digit(board[i][j], 10) - 1]) {
                    return false;
                } else {
                    vertail[i][Character.digit(board[i][j], 10) - 1] = true;
                }
                if (cell[3 * (i / 3) + j / 3][Character.digit(board[i][j], 10) - 1]) {
                    return false;
                } else {
                    cell[3 * (i / 3) + j / 3][Character.digit(board[i][j], 10) - 1] = true;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Interview30 interview30 = new Interview30();
        System.out.println(interview30.isValidSudoku(new char[][]
                {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                        {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
                }));
    }
}
