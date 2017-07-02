package com.viking.kotlin

import com.viking.kotlin.model.Person

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/7/2
 */
fun main(args: Array<String>){
    val person = Person()

    println(person.name)
    person.age = 25
    println(person.age)
}