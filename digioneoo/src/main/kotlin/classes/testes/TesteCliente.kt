package classes.testes

import classes.Cliente
import classes.ClienteTipo

fun main() {
        val maria = Cliente(
        nome = "maria clara",
        cpf = "111.222.333.44",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(maria)

    TesteAuteticacao().autentica(maria)
}