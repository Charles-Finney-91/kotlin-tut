package org.example.basics

val add = { a: Int, b: Int -> a + b }

val sub = { a: Int, b: Int -> a - b }

val mul = { a: Int, b: Int -> a * b }

val div = { a: Int, b: Int -> a / b }

fun main() {
    Calc.ADD

//    calcMain(3, 2, add)
//
//    calcMain(3, 2, sub)
//
//    calcMain(3, 2, mul)
//
//    calcMain(3, 2, div)
}

fun calcMain(a: Int, b: Int, ops: Calc){
//    println("${ops.name} : ${ops.}")
}

enum class Calc(name: String, calc: (Int, Int) -> Int){
    ADD("Add", { a: Int, b: Int -> a + b }),
    SUB("Sub", { a: Int, b: Int -> a - b }),
    MUL("Mul", { a: Int, b: Int -> a * b }),
    DIV("Div", { a: Int, b: Int -> a / b }),
    MOD("Mod", { a: Int, b: Int -> a % b })
}