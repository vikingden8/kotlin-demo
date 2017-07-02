package com.viking.kotlin

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/7/2
 */
fun main(args: Array<String>){
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello , $name!")
    println("Hello , ${name}hah!")
    println("Hello , \$name!")
    println("Hello , ${"$"}name!")
    println("Hello , ${if (args.size > 0) args[0] else "Kotlin"}!")

}