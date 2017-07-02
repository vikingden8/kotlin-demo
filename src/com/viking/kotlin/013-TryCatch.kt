package com.viking.kotlin

import java.io.BufferedReader
import java.io.StringReader

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/7/2
 */
fun readNumber(reader: BufferedReader): Int?{
    try {
        val num = reader.readLine() ;
        return Integer.parseInt(num)
    }catch (e: NumberFormatException){
        return null
    }finally {
        reader.close()
    }
}

fun main(args: Array<String>) {
    val num = readNumber(BufferedReader(StringReader("123")))
    println(num)
    val num1 = readNumber(BufferedReader(StringReader("ere")))
    println(num1)
}