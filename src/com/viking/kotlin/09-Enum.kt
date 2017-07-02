package com.viking.kotlin

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/7/2
 */
enum class Color{
    RED,
    GREEN,
    BLUE
}

fun main(args: Array<String>) {
    val red = Color.RED
    println(red)
    println(red.ordinal)
    println(red.name)
    val colorName = when(red){
        Color.RED -> "红色"
        Color.GREEN -> "绿色"
        Color.BLUE -> "蓝色"
    }

    println(colorName)
}