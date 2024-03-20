package br.edu.umfg.master

fun main() {
    print("Digite a primeira palavra: ")
    val primeiraString = readLine() ?: ""
    print("Digite a segunda palavra: ")
    val segundaString = readLine() ?: ""

    if (primeiraString.length != segundaString.length) {
        println("NÃO É ANAGRAMA")
    } else {
        val primeira = primeiraString.toCharArray().sorted()
        val segunda = segundaString.toCharArray().sorted()

        if (primeira == segunda) {
            println("ANAGRAMA")
        } else {
            println("NÃO É ANAGRAMA")
        }
    }
}

