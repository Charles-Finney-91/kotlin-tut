package org.example.basics

fun log(msg: String) = println("[LOG] $msg")

interface PersonInfoProvider{
    fun printInfo(person: ClassTut)
}

/**
 *
 */
class BasicInfoProvider : PersonInfoProvider{
    override fun printInfo(person: ClassTut) {
        person.printInfo()
    }
}

interface PersonInfoProviderV2{
    // We can hae properties also in kotlin interface
    // We cannot initialize them though
    val infoProviderName: String

    fun printInfo(person: ClassTut){
        log(infoProviderName)
        person.printInfo()
    }
}

interface SessionInfoProvider{
    fun getSessionId(): Int
}

class BasicInfoProviderV2 : PersonInfoProviderV2, SessionInfoProvider{
    override val infoProviderName: String
        get() = "BasicInfoProviderV2"

    /**
     * If the default functionality is given
     * We don't have to explicitly implement the interface function
     */

    /**
     * We will have to implement functions that are not defaulted in the interfaces
     */
    override fun getSessionId() = 1
}

fun main() {
    val infoProvider: PersonInfoProviderV2 = BasicInfoProviderV2()
    infoProvider.printInfo(ClassTut())

    // Type checking
    if (infoProvider is SessionInfoProvider){
        // Type casting
//        (infoProvider as SessionInfoProvider).getSessionId()

        // Kotlin automatically casts to the type that is checked conditionally
        log(infoProvider.getSessionId().toString())
    }
    else {
        print("Session not started")
    }
}