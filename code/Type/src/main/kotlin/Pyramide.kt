package org.ballestero

fun main(args: Array<String>){
    for (i in args){
        pyramide(i.toInt())
    }
}

fun pyramide(hauteur: Int){
    var nbEtoiles: Int = 1
    var nbEspaces: Int = 3
    var lignes: String = ""
    for (j in 1 .. hauteur){
        lignes = " ".repeat(nbEspaces) + "*".repeat(nbEtoiles)
        println(lignes)
        nbEspaces -= 1
        nbEtoiles += 2
    }
}