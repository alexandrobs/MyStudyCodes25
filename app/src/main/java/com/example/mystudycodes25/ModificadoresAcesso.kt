package com.example.mystudycodes25

/*
Modificadores de acesso
public
private
protected
internal
public
 */

private class Carro2 {
    private var modelo = "Padrao"

    private fun injetarCombustivel() {
        println("Injetar combustivel")
    }

    fun acelerar() {
        println("Exibe modelo do Carro2: $modelo")
        injetarCombustivel()
        println("Acelerar do Carro2")
    }
}

//classe pai
open class Carro1 {

    protected open fun ligarModoTurbo() {
        println("Modo turbo")
    }

    fun acelerar() {
        ligarModoTurbo()
        println("Acelerar do Carro1")
    }
}

//classe filha
class Gol : Carro1() {
    override fun ligarModoTurbo() {
        super.ligarModoTurbo()
        println("do Gol ativado")
    }
}

//classe filha
class Ferrari : Carro1() {

}

fun main() {
    val carro = Carro1()
    carro.acelerar()

    val carro2 = Carro2()
    carro2.acelerar()

    val carro3 = Carro1()
    carro3.acelerar()

    val gol = Carro1()
    gol.acelerar()
}