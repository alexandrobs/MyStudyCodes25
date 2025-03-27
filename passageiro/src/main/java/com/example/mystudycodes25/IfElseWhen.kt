package com.example.mystudycodes25

fun main() {

    val notaAluno = 5
    val condicao = notaAluno >= 6
    if (condicao) {
        println("Aprovado")
    } else {
        println("Reprovado")
    }

    val opcao = 1
    if (opcao == 1) {
        println("crédito")
    } else if (opcao == 2) {
        println("débito")
    } else if (opcao == 3) {
        println("pix")
    } else {
        println("opção invalida")
    }

    val opcao2 = 2
    if (opcao2 in 1..3) {
        println("opções selecionadas: 1, 2, 3")
    } else if (opcao2 in 4..5) {
        println("opções selecionadas: 4, 5, 6")
    } else {
        println("nenhuma opção válida")
    }

    val opcao3 = 8
    when (opcao3) {
        1 -> println("crédito")
        2 -> println("débito")
        3 -> println("pix")
        in 4..7 -> println("outras opções")
        else -> println("opção invalida")
    }
}