package com.example.mystudycodes25

//usando construtor, sem o nome constructor

class Usuario3(nome: String, sobrenome: String){

    var nome: String = ""
    var sobrenome: String = ""

    init {
        println("Objeto inicializado")
        this.nome = nome
        this.sobrenome = sobrenome
        println("nome: $nome - sobrenome: $sobrenome")
    }
}

//construtor primario
class Usuario4(
    var nome: String = "",
    var sobrenome: String = ""
) {
    init {
        println("Objeto inicializado")
        println("nome: $nome - sobrenome: $sobrenome")
    }

    //construtor secundario
    constructor(nome: String): this(nome, "") {
        println("Construtor secundario")
    }

}

fun main() {
    val usuario3 = Usuario3("Jamilton", "Cabeção")
    val usuario4 = Usuario4("Jamilton", "Cabeção")
    val usuario4_1 = Usuario4("Jamilton")
}