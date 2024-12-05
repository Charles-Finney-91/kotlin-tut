package org.example.ex

val paths = mapOf(
    "city1" to "city2",
    "city4" to "city5",
    "city2" to "city3",
    "city3" to "city4",
)

fun getCityWithoutDestination(paths: Map<String, String>): String {
    val outs = mutableSetOf<String>()
    val ins = mutableSetOf<String>()

    paths.forEach { from, to ->
        outs.add(from)
        ins.add(to)
    }

    return ins.first { it -> !outs.contains(it) }
}

fun main() {
    println(getCityWithoutDestination(paths))
}