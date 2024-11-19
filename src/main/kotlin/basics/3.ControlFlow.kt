package org.example.basics

fun main() {
    var name = ""
    var greeting = "Hello"

    // if statement
//    if (name != null)
//        println("$greeting, $name")
//    else
//        println(greeting)

    // when statement
//    when(name.lowercase()){
//        "charles" -> println("$greeting, your first name is $name")
//        "grandson" -> println("$greeting, your middle name is $name")
//        "finney" -> println("$greeting, your last name is $name")
//        else -> println("$greeting, no name")
//    }

    // when statement 2
//    when{
//        name.lowercase() == "charles" -> println("$greeting, your first name is $name")
//        name.lowercase() =="grandson" -> println("$greeting, your middle name is $name")
//        name.lowercase() =="finney" -> println("$greeting, your last name is $name")
//        else -> println("$greeting, no name")
//    }

    // if as expression
//    val nameType = if (name.lowercase() == "charles") "first name" else "last name"
//    println("$greeting, your $nameType is $name")

    // when as expression
    val nameType = when {
        name.lowercase() == "charles" -> "your first name is"
        name.lowercase() == "grandson" -> "your middle name is"
        name.lowercase() == "finney" -> "your last name is"
        else -> "no name"
    }
    println("$greeting, $nameType $name")

}