package com.example.mystudycodes25

//funções sem retorno
fun somar() {
    println( 5 + 5)
}

//funções com retorno
fun somar2(): Int {
    var num1 = 10
    var num2 = 5
    var resultado = num1 + num2
    return resultado
}

//funções inline, sem retorno
fun subtrair() = println( 10 - 8)
//funções inline, com retorno sem return, passando direto depois de =
fun subtrair2(): Int = 10 - 8

fun main() {
    somar()
    println(somar2())
    val retorno = somar2()
    println(retorno)

    subtrair()
    println(subtrair2())
}