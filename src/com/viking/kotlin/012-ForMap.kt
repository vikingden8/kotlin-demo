package com.viking.kotlin

import java.util.*

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/7/2
 */
fun main(args: Array<String>) {
    val binaryRepo = TreeMap<Char, String>()

    for (c in 'A'..'H'){
        val binary = Integer.toBinaryString(c.toInt())
        binaryRepo[c] = binary
    }

    for ((letter, binary) in binaryRepo){
        println("$letter = $binary")
    }
}