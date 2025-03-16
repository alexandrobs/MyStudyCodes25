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

    //Operadores Relacionais
    println(num1 == num2)
    println(num1 != num2)
    println(num1 > num2)
    println(num1 < num2)
    println(num1 >= num2)
    println(num1 <= num2)

    //Operadores Lógicos
    println(num1 > num2 && num2 > num1)
    println(num1 > num2 || num2 > num1)
    var resultado8 = false && true
    println(resultado8)
    println(!resultado8)

    val idadePessoa = 30
    val comprasPessoa = 1000
    val resultado9 = idadePessoa >= 50 && comprasPessoa >= 400
    val resultado10 = idadePessoa >= 50 || comprasPessoa >= 400
    println(resultado9)
    println(resultado10)
}