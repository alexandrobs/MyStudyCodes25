package com.example.motorista

class Carro(
    var modelo: String = "",
    var velocidade: Int = 0
) {
    fun exibirInformações() {
        println("Informações: $modelo e $velocidade")
    }
}

fun main() {
    val carro = Carro("Fusca", 100)
    carro.exibirInformações()

    val ferrari = Carro("Ferrari", 200)
    ferrari.exibirInformações()

    println("PI: ${Math.PI}")
}