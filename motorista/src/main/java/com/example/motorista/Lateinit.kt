package com.example.motorista

class Produto {
    //para declarar esse atributo, podemos iniciar ele com uma string vazia
    var descricao: String = ""
    //ou iniciar ele com um valor null
    var modelo: String? = null
    //ou usar lateinit
    lateinit var nome: String

}

fun main() {
    val produto = Produto()
    println(produto.descricao)
    println(produto.modelo)
    //aqui vai dar erro porque não iniciou nome com nenhum valor
    //println(produto.nome)
    produto.nome = "Nome do produto exemplo"
    println(produto.nome)
}