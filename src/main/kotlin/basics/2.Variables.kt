package org.example.basics

/**
 * Top level variables does not need a class to be declared
 *
 * variables are non-nullable by default
 */

val name: String = "Charles"
var greeting: String = "Hello"


/**
 * To add nullability add '?' after the type
 */

val nullableName: String? = null


/**
 * Type inference
 * 1. we dont have to specify type for variables it wil be inferred
 * 2. By default kotlin types are non nullable
 * in order to infer nullable values, we need to specify type
 * because type inference wont know what type is being nulled
 */

val inferredName = "Charles"

var inferredNullINCORRECT = null

var inferredNullCorrect: String? = null


/**
 * val : immutable
 * var: mutable
 */
fun main() {
    println("$greeting $name")
}