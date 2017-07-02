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
}