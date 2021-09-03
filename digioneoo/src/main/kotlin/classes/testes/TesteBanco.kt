package classes.testes

import classes.Banco

fun main() {
    val digiOneBank = Banco("DigiOne", 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)
}