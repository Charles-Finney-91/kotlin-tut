package org.example.basics


/**
 * Collections in kotlin are by default immutable
 * If we want to create mutable collections, please use the convenience function
 * mutableListOf() , mutableMapOf() ...
 */
fun main() {
//    val names = listOf("Charles", "Grandson", "Finney")
//    names.forEachIndexed { i, name -> println("[$i] ${name.uppercase()}")  }

    val nameMap = mutableMapOf(
        "first name" to "Charles",
        "middle name" to "Grandson",
        "last name" to "Finney"
    )

    nameMap.forEach { nameType, name -> println("Hello, your $nameType is $name") }
}

