package org.ballestero

fun main(){
    var question: String = "Veuillez entrer un nombre : "

    while (true){
        println(question)

        try {
            var num: Int = readln().toInt()
            println("Merci, votre nombre est ${num}.")
            return
        }
        catch (e:Exception){
            println("Ceci n’est pas un nombre, veuillez entrer un nombre :")
        }
    }
}