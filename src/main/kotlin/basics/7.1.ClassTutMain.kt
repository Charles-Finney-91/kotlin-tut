package org.example.basics

fun main() {
    val rock = ClassTut(
        firstName = "Dwayne",
        lastName = "Johnson"
    )

    rock.printInfo()

    rock.nickName = "The Rock"

    rock.printInfo()
}