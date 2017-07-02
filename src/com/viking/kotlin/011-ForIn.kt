package com.viking.kotlin

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/7/2
 */
fun main(args: Array<String>) {
    for (x in 1..10) {
        println(x)
    }

    for (index in (1..10).withIndex()){
        println(index.index)
    }
}