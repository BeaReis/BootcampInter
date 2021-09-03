package classes.testes

import classes.Analista
import classes.Funcionario

fun main() {
    val lucas = Analista("Lucas Marques", "111.111.222-11", 2000.0)
    ImprimeRelatorioFuncionario.imprime(lucas)
}

