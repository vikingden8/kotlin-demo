package com.viking.kotlin

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/7/2
 */
fun main(args: Array<String>) {
    val arg : String = if (args.size > 0) args[0] else "2"
    val result = when(arg){
        "0","1" -> "0 or 1"
        else -> "no match"
    }
    println(result)

    val x = 8
    when (x) {
        in 1..10 -> print("x is in the range")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }
}