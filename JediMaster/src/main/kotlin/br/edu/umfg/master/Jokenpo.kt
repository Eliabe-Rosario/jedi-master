package br.edu.umfg.master

fun jokenpoSpok(jogador1: String, jogador2: String): String {
    return when {
        jogador1 == jogador2 -> "EMPATE"
        jogador1 == "pedra" && jogador2 == "tesoura" ||
                jogador1 == "tesoura" && jogador2 == "papel" ||
                jogador1 == "papel" && jogador2 == "pedra" -> "Jogador 1 vence"
        else -> "Jogador 2 vence"
    }
}

fun main() {

    val jogador1 = "pedra"
    val jogador2 = "pedra"
    println(jokenpoSpok(jogador1, jogador2))


}
