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

//funções com parametros nomeados
fun somarPersonalizado(num1: Int, num2: Int) {
    println(num1 + num2)
}

fun somarPersonalizado2(num1: Int, num2: Int = 0) {
    println(num1 + num2)
}

fun main() {
    somar()
    println(somar2())
    val retorno = somar2()
    println(retorno)

    subtrair()
    println(subtrair2())

    somarPersonalizado(5, 25)
    //usando a função com parametros nomeados
    somarPersonalizado(num2 = 10, num1 = 50)
    //função sem valor default obriga você a colocar os dois parametros, caso contrário é erro, ex: linha 43
    //somarPersonalizado(5)
    //função com valor default no parametro num2, ele no caso agora é opcional, caso não coloque ele será 0 por default
    somarPersonalizado2(5)
}