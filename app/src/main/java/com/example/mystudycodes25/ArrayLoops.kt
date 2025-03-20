package com.example.mystudycodes25

fun main() {

    val nomes = arrayOf(
        "Jamilton", "Ana"
    )

    nomes[0] = "José"

    println( nomes[0])

    var numero = 1

    while ( numero <= 5 ){
        println(numero++)
    }

    while ( numero in 1..8){
        println(numero++)
    }

    for ( numero in 1..50 ){
        println(numero)
    }

    for ( nomes in nomes){
        println("nomes: $nomes")
    }

    for ( (indice, nomes) in nomes.withIndex()){
        println("indice: $indice / nome: $nomes")
    }

}