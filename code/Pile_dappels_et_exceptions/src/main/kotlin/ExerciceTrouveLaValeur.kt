package org.ballestero

class ElementNonTrouver(message: String) : Exception(message)

fun main(){
    val tab1 = arrayOf("Pomme", "Banane", "Cerise", "Orange", "Mangue")
    try {
        val index = truveru(tab1, "Banane")
        println("L'élément " + tab1[index] + " a été trouvé à l'index : " + index)
    }
    catch (e: ElementNonTrouver){
        println("Erreur : " + e.message)
    }
    try {
        val index = truveru(tab1, "orange")
        println("L'élément " + tab1[index] + " a été trouvé à l'index : " + index)
    }
    catch (e: ElementNonTrouver){
        println("Erreur : " + e.message)
    }
}

fun truveru (tab: Array<String>, element: String): Int{
    val index = tab.indexOf(element)
    if (index == -1) {
        throw ElementNonTrouver("L'élément "+ element +" n'a pas été trouvé dans le tableau.")
    }
    return index
}