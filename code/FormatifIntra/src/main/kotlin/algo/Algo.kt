package algo

fun main() {
}

/**
 * Calcule la racine carrée d'un nombre en utilisant une méthode itérative.
 *
 * @param x un nombre en virgule flottante
 * @return la racine carrée approximative de x
 */
fun racineCarre(x: Float): Float {
  /*  racineCarre(x qui est un nombre en virgule flottante)
    resultat est initialisé à 0,0
    Tant que (resultat + 1) * (resultat +1) est inférieur ou égal à x faire
            resultat++
    fin du tant que
            remplir un tableau appelé fractions avec les valeurs 0,1 puis 0,01 puis 0,001 puis 0,0001
    pour fraction dans fractions faire
    initialiser base avec la valeur de resultat
    pour chaque chiffre entre 0 et 9 inclus, faire
    initialiser test avec la valeur de base + (fraction * chiffre)
    si test multiplié par test est inférieur ou égal à x
    alors on veut que resultat prenne la valeur de test
            fin du pour sur les chiffre

            fin du pour sur les fraction
            renvoyer resultat*/
    var resultat: Float = 0.0f
    while ((resultat + 1) * (resultat + 1) <= x){
        resultat++
    }
    var fractions: Array<Float> = arrayOf(0.1f, 0.01f, 0.001f, 0.0001f)
    for (fraction in fractions){
        val base: Float = resultat
        for (chiffre in 0 .. 9){
            val test: Float = base + (fraction * chiffre)
            if (test * test <= x){
                resultat = test
            }
        }
    }
    return  resultat
}