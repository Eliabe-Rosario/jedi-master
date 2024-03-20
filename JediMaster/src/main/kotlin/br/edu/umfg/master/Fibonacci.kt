package br.edu.umfg.master

fun main() {
    print("ENTRE COM UM NUMERO ")
    val l = readLine()?.toInt() ?: return

    var a = 0
    var b = 1

    print("FIBONACCI: $l: ")

    repeat(l) {
        print("$a ")
        val sum = a + b
        a = b
        b = sum
    }
}

