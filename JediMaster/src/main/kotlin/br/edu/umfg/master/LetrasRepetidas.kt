package br.edu.umfg.master

fun main() {
    print("ENTRE COM UM TEXTO: ")
    val texto = readLine() ?: ""

    var encontrada = false

    for (char in texto) {
        if (texto.indexOf(char) == texto.lastIndexOf(char)) {
            println("PRIMEIRA NÃO REPETIDA $char")
            encontrada = true
            break
        }
    }

}
