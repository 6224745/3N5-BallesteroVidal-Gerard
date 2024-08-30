package org.ballestero

fun main(args: Array<String>) {
    val hauteur: Int = args[0].toInt()
    val pyramide: String = pyramide(hauteur)
    print(pyramide)
}
fun pyramide(hauteur: Int) : String{
    var triangle: String = ""
    for(i in 1 .. hauteur){
        for(j in 1..i){
            triangle += "*"
        }
        triangle += "\n"
    }
    return triangle
}