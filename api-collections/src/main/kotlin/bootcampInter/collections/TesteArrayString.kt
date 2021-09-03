package bootcampInter.collections

fun main() {
    val nomes = Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "Zazá"
    nomes[2] = "José"

    println("-------------")
    for (nome in nomes) {
        println(nome)
    }

    println("-------------")
    nomes.sort()
    nomes.forEach { println(it) }

    println("-------------")
    val nome1 = arrayOf("Maria", "Zazá", "José")
    nome1.sort()
    nome1.forEach { println(it) }
}