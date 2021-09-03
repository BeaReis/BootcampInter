package classes.testes

import classes.Funcionario

class ImprimeRelatorioFuncionario {
        companion object{
            fun imprime(funcionario: Funcionario){
                println(funcionario.toString())
            }
        }
}