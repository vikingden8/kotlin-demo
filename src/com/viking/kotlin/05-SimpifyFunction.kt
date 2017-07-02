package com.viking.kotlin

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/7/2
 */
fun maxwithoutreturn(x: Int, y: Int):Int = if (x > y) x else y

fun maxwithoutreturntype(x: Int, y: Int) = if (x > y) x else y

fun main(args: Array<String>){
    println(maxwithoutreturn(5, 8))
    println(maxwithoutreturntype(5, 8))
}