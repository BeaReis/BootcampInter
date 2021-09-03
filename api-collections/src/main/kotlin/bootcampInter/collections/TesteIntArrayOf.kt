package bootcampInter.collections

fun main() {
    val values = intArrayOf(2, 3, 4, 10, 7)

    println("-------------")
    values.forEach { println(it) }

    println("-------------")
    values.sort()
    values.forEach { println(it) }
}