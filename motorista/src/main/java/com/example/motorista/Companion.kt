package com.example.motorista

class Carro(
    var modelo: String = "",
    var velocidade: Int = 0
) {

    companion object {
        const val VELOCIDADE_MAX_PERMITIDA = 120
        fun exibirVelocidadeMaximaPermitida(){
            println("Velocidade máxima permititda: ${Carro.VELOCIDADE_MAX_PERMITIDA}")
        }
    }

    fun exibirInformações() {
        println("Informações: $modelo e $velocidade")
    }
}

fun main() {

    println("Velocidade máxima permititda: ${Carro.VELOCIDADE_MAX_PERMITIDA}")
    Carro.exibirVelocidadeMaximaPermitida()

    val carro = Carro("Fusca", 100)
    carro.exibirInformações()

    val ferrari = Carro("Ferrari", 200)
    ferrari.exibirInformações()

    println("PI: ${Math.PI}")
}