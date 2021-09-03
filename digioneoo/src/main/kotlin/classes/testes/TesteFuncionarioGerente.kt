package classes.testes

import classes.Gerente

fun main() {
    val beatriz = Gerente("Beatriz","123.123.123-11", 5000.0, "senha123")
    ImprimeRelatorioFuncionario.imprime(beatriz)

    TesteAuteticacao().autentica(beatriz)
}
