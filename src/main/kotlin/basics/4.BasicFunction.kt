package org.example.basics

/**
 * this is top level function
 */

fun sayHelloTo(name: String?) = when {
    name?.lowercase() == "charles" -> println("Hello, your first name is $name")
    name?.lowercase() == "grandson" -> println("Hello, your middle name is $name")
    name?.lowercase() == "finney" -> println("Hello, your last name is $name")
    else -> println("Hello, no name")
}

fun main() {
    sayHelloTo(null)
}