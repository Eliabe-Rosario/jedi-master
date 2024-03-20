package br.edu.umfg.master

fun main() {
    print("Digite uma frase: ")
    val texto = readLine()?: ""

    val alfabeto = "abcdefghijklmnopqrstuvwxyz"

    val teste = alfabeto.all { letra -> texto.contains(letra) }

    if (teste) {
        println("PANGRAMA")
    } else {
        println("NÃO PANGRAMA")
    }
}
