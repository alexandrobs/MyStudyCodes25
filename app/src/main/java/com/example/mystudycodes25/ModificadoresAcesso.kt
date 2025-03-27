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
    var modelo = ""
    fun acelerar() = println("Acelerar")
}

class Carro1 {
    var modelo = ""
    fun acelerar() = println("Acelerar")
}

fun main() {
    val carro = Carro1()
    carro.modelo = "Esportivo"
    println(carro.modelo)
    carro.acelerar()
}