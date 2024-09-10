package org.ballestero

import  java.io.File

fun main(args: Array<String>){
    var NomFichier1: String = args[0]
    var NomFichier2: String = args[1]
    var fichier1: File = File(NomFichier1)
    if(fichier1.exists()){
        try {
            var text1: String = fichier1.readText()
            println(text1)
            var liste1: List<String> = text1.split("\n")
            println(liste1)
            var text2: String = liste1.joinToString("\n----------\n")
            println(text2)
            var fichier2: File = File(NomFichier2)
            fichier2.writeText(text2)
        }
        catch (e: Exception){
            println("Le fichier $NomFichier1 ne peut pas etre lu.")
        }
    }
    else{
        println("Le fichier $NomFichier1 n'existe pas!")
    }
}