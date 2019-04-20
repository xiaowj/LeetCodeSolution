package com.github.xiowj.interview

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/33/
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 */
class Interview33 {
    fun reverse(x: Int): Int {
        val b: Boolean
        val tempInt: Int
        if (x < 0) {
            b = true
            tempInt = -x
        } else {
            b = false
            tempInt = x
        }
        val tempCharArray = tempInt.toString().toCharArray()
        tempCharArray.reverse()
        val tempString = String(tempCharArray)
        return try {
            if (b) {
                ("-$tempString").toInt()
            } else {
                tempString.toInt()
            }
        } catch (e: Exception) {
            0
        }
    }
}

fun main() {
    val inter = Interview33()
    println(inter.reverse(123))
    println(inter.reverse(-100))
    println(inter.reverse(-123))
}