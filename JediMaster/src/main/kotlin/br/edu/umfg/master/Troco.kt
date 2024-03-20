package br.edu.umfg.master

fun main() {
    print("TOTAL DA COMPRA ")
    val valorCompra = readLine()?.toDoubleOrNull() ?: return

    print("VALOR PAGO ")
    val valorPago = readLine()?.toDoubleOrNull() ?: return

    var troco = valorPago - valorCompra

    val cem = troco.toInt() / 100
    troco %= 100.0

    val cinquenta = troco.toInt() / 50
    troco %= 50.0

    val vinte = troco.toInt() / 20
    troco %= 20.0

    val dez = troco.toInt() / 10
    troco %= 10.0

    val cinco = troco.toInt() / 5
    troco %= 5.0

    val dois = troco.toInt() / 2
    troco %= 2.0

    val um = troco.toInt()

    troco %= 1.0
    val cinquentaCentavos = (troco / 0.5).toInt()
    troco %= 0.5

    val vinteCincoCentavos = (troco / 0.25).toInt()
    troco %= 0.25

    val dezCentavos = (troco / 0.1).toInt()
    troco %= 0.1

    val cincoCentavos = (troco / 0.05).toInt()
    troco %= 0.05

    val umCentavo = (troco / 0.01).toInt()


    println("$cem R$100")
    println("$cinquenta R$50")
    println("$vinte R$20")
    println("$dez R$10")
    println("$cinco R$5")
    println("$dois R$2")
    println("$um R$1")
    println("$cinquentaCentavos R$0.50")
    println("$vinteCincoCentavos  R$0.25")
    println("$dezCentavos R$0.10")
    println("$cincoCentavos R$0.05")
    println("$umCentavo R$0.01")
}
