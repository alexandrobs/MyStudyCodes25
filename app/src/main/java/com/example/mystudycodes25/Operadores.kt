package com.example.mystudycodes25

fun main() {

    //Operadores Aritméticos

    var num1 = 10
    var num2 = 30

    val resultado = num1 + num2
    val resultado2 = num1 - num2
    val resultado3 = num1 * num2
    val resultado4 = num2 / num1
    val resultado5 = num1 % num2

    val resultado6 = num1 + num2 * num1 / num2 - num1
    val resultado7 = num1 + num2 * num1 / (num2 - num1)

    //Precedência de operadores
    //1.Parênteses
    //2.Multiplicação e divisão
    //3.Subtração e adição

    println(resultado)
    println(resultado2)
    println(resultado3)
    println(resultado4)
    println(resultado5)
    println(resultado6)
    println(resultado7)

}