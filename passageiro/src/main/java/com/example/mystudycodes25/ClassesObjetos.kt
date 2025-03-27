package com.example.mystudycodes25

/* Pilares do OO
Abstração
Herança
Encapsulamento
Polimorfismo
 */

class Jogador {
    var kart = ""
    var pneu = ""
    var planador = ""

    fun acelerar(aceleracao: Int = 0) {
        if (aceleracao <= 0)
        println("Acelerar de 0 a 80")
        else if (aceleracao >= 80)
            println("Acelerar de 80 ou mais que isso")
        else
            println("Sem acelerar")
    }

    fun retornarPoder(): String {
        return "Poder do Casco Vermelho"
    }

    fun retornarEspecial(): String = "Soltando o Especial"
}

fun main() {
    val jogador = Jogador()
    jogador.kart = "Kart do Mario"
    jogador.pneu = "Pneu de Asfalto"
    jogador.planador = "Asa Delta"
    jogador.acelerar(80)
    jogador.acelerar()
    println(jogador.retornarPoder())
    println(jogador.retornarEspecial())
}