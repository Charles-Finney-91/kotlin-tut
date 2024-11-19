package org.example.basics44

/**
 * vararg lets us have variable number of arguments
 * it is processed as an array of arguments inside the function
 * Note that it is only processed as array of arguments INSIDE the function
 * but as a parameter it will still adhere to the type that is provided
 */
fun test(greeting: String, vararg names: String) = names.forEach { name -> println("$greeting, $name") }

/**
 * We can also have default values in the function
 */
fun testV2(greeting: String = "Hello", vararg names: String = arrayOf("Charles")) = names.forEach { name -> println("$greeting, $name") }

fun main() {
//    test("Hello", "Charles", "Grandson", "Finney")

    /**
     * We cannot pass an array as a parameter for vararg
     * even though it processes the data as array INSIDE the function
     * it still requires us to pass the data as String in parameters
     * For this we can use the spread operator *<arr>
     */
    val arr = arrayOf("Charles", "Grandson", "Finney")
//    test("Hello", *arr)

    /**
     * We can extend kotlins' function parameters with named parameters
     * by naming the parameter that we are passing, we can jumble the order of parameters also
     * this is used when the function structure changes and it does not affect the clients using it
     */
    test(
        names = arr,
        greeting = "Hello"
    )

    /**
     * When using default values, we can simply call the function without any values to get the default functionality
     * (or) we can just add the parameters that is required using named parameters
     */
    testV2(
        greeting = "Hi"
    )

    testV2(
        names = arr
    )

}