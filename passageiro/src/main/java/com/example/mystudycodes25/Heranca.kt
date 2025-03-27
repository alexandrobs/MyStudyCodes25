package com.example.mystudycodes25

/*
Herança
Polimorfismo
Polimorfismo por sobreposição

---

Classe concreta vs classe abstrata,
metodo abstrato
 */

//classe mae
abstract class Animal() {
    var cor = ""
    var tamanho = ""
    var peso = 0.0

    open fun correr () = println("correndo como um")

    abstract fun dormir()
}

//classe filha
class Cao() : Animal() {
    fun latir() {
        println("latindo")
    }

    override fun correr() {
        super.correr()
        println("cao de 4 patas")
    }

    override fun dormir() {
        println("dormindo como um cao na casinha")
    }
}

//classe filha
class Passaro() : Animal() {
    fun voar() {
        println("voando")
    }

    override fun correr() {
        super.correr()
        println("passaro de 2 perninhas e batendo as asas")
    }

    override fun dormir() {
        println("dormindo como um passaro no galho")
    }
}

fun main() {

    val cao = Cao()
    cao.cor = "Preto"
    cao.tamanho = "Grande"
    cao.peso = 10.0
    println(cao.cor)
    println(cao.tamanho)
    println(cao.peso)
    cao.correr()
    cao.dormir()
    cao.latir()

    val passaro = Passaro()
    passaro.cor = "Verde"
    passaro.tamanho = "Pequeno"
    passaro.peso = 0.200
    println(passaro.cor)
    println(passaro.tamanho)
    println(passaro.peso)
    passaro.correr()
    passaro.dormir()
    passaro.voar()
}