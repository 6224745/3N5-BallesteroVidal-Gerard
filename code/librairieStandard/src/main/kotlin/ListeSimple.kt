package org.ballestero

fun main(){
    println(repete(5, 1))
}
fun repete(n: Int, nbFois: Int): List<Int>{
    val resultList = mutableListOf<Int>()

    for (i in 1..n) {
        repeat(nbFois) {
            resultList.add(i)
        }
    }
    return resultList
}