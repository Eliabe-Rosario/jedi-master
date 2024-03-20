package br.edu.umfg.master

fun main() {
    val numeros = mutableListOf<Int>()
    println("ENTRE COM 8 NUMEROS PARA CALCULO DE MEDIA, COLOQUE O NUMERO E TECLE ENTER")
    repeat(8) {
        print("Digite um número inteiro: ")
        val numero = readLine()!!.toInt()
        numeros.add(numero)
    }

    val media = numeros.average()
    println("A MEDIA DOS 8 NUMEROS É: $media")
}
