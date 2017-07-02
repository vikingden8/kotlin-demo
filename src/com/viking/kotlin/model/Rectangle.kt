package com.viking.kotlin.model

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/7/2
 */
class Rectangle(val height: Int, val width: Int){
    val isSquare: Boolean
        get() {
            return height == width
        }
}