package bootcampInter.collections

fun main() {
    val joao = Funcionario("João", 1000.0, "CLT")
    val pedro = Funcionario("Pedro", 2000.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    println("----------List-------------")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach{ println(it) }

    println("------------")
    funcionarios.add(pedro)
    funcionarios.forEach{println(it)}

    println("------------")
    funcionarios.remove(joao)
    funcionarios.forEach{println(it)}

    println("-----------Set-------------")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach{ println(it) }

    println("-------------")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach{ println(it) }

}