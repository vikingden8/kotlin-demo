package com.viking.kotlin

import com.viking.kotlin.model.Rectangle

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/7/2
 */
fun main(args: Array<String>){
    val rectangle = Rectangle(35, 35)
    println(rectangle.isSquare)
    val rectangle1 = Rectangle(35, 45)
    println(rectangle1.isSquare)
}