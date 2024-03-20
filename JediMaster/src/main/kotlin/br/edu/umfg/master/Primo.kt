fun primo
            (valor: Int): Boolean {
    if (valor <= 1) return false
    if (valor == 2) return true
    if (valor % 2 == 0) return false
    var divisor = 3
    while (divisor * divisor <= valor) {
        if (valor % divisor == 0) return false
        divisor += 2
    }
    return true
}

fun main() {
    print("DIGITE UM NUMERO: ")
    val usuario = readLine()
    val numero = usuario?.toIntOrNull()

        val primo = numero?.let { primo(it) }

        if (primo == true) {
            println("$numero PRIMO.")
        } else {
            println("$numero NAO PRIMO.")
        }

    }
