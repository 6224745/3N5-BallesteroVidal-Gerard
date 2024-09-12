package org.ballestero

fun main(args: Array<String>){
    val liste: MutableList<Double> = mutableListOf()
    for(i in args)
    {
        val num = i.toDouble()
        liste.add(num)
    }
    //println(triInverseALaMain(liste))
    triInverse(liste)
}

//fun triInverseALaMain(liste: List<Double>){

//}

fun triInverse(listeinver: List<Double>){
    val liste1: List<Double> = listeinver.reversed()
    println(liste1)
}