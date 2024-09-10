package org.ballestero

import  java.io.File

fun main(args: Array<String>){
    val fichier = File("Vide.txt")
    if(fichier.createNewFile()){
        println("Le fichier ${fichier} a été créée correctement")
    }
    else{
        println("Le fichier ${fichier} existe deja")
    }

    val fichierNomPrenom = File("../../Nom_Prenom.txt")
    val text: String = "Gerard Ballestero"
    fichierNomPrenom.writeText(text)
    println("Le fichier ${fichierNomPrenom} a été créée correctement")
}