package com.viking.kotlin

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/7/2
 */
fun max(x: Int, y: Int):Int{
    return if (x > y) x else y
}

fun main(args: Array<String>){
    println(max(5, 8))
}