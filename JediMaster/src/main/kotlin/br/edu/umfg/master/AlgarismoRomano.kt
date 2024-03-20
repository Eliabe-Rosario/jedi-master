package br.edu.umfg.master

fun main() {
    fun numeralToInt(s: String): Int {
        fun getValue(c: Char): Int {
            return when (c) {
                'I' -> 1
                'V' -> 5
                'X' -> 10
                'L' -> 50
                'C' -> 100
                'D' -> 500
                'M' -> 1000
                else -> throw IllegalArgumentException("VALOR INVALIDO")
            }
        }

        var vale = 0
        var romq = 0

        for (i in s.indices.reversed()) {
            val valor = getValue(s[i])

            if (valor < romq) {
                vale -= valor
            } else {
                vale += valor
            }

            romq = valor
        }

        return vale
    }

    print("DIGITE UM NUMERO ROMANO")
    val numeral = readLine() ?: ""
    val convertido = numeralToInt(numeral)
    println(" $convertido")
}




