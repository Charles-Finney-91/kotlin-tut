package org.example.basics

import java.time.LocalDate

class ClassTut(
    val firstName: String = "",
    val lastName: String = ""
){
    var nickName: String? = null
        set(value) {
            field = value
            println("[LOG] Nick name changed to $nickName at ${LocalDate.now()}")
        }
        get() {
            println("[LOG] Value of nick name is accessed at ${LocalDate.now()}")
            return field
        }

    fun printInfo(){
        /**
         * ?: is called the elvis operator
         * It is similar to if (nickname != null) nickName else ""
         */
        val nickNameToPrint = nickName ?: ""
        println("This is $firstName \"$nickNameToPrint\" $lastName")
    }
}