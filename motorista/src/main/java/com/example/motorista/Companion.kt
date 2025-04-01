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

class Usuario {

    //não nomeado
    companion object {

        fun verificaSeUsuarioEstaLogado(): Boolean {
            return true
        }
    }
}
class Usuario2 {

    //nomeado
    companion object regra{
        fun verificaSeUsuarioEstaLogado(): Boolean {
            return true
        }
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

    //Aqui precisa instancia a classe para usar o metodo verifica...
    //val usuario = Usuario()
    //print(usuario.verificaSeUsuarioEstaLogado())

    //Aqui não precisamos instanciar a classe para usar o metodo verifica,
    // apenas chamamos a classe e acessamos seu metodo de classe...
    println(Usuario.verificaSeUsuarioEstaLogado())

    println(Usuario2.regra.verificaSeUsuarioEstaLogado())
}