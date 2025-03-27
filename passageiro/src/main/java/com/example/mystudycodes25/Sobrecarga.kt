package com.example.mystudycodes25

/*
Sobrecarga
de métodos
 */

class Usuario2 {
    //assinatura nome + parametros e seus tipos
    fun logar(email: String, senha: String) {
        println("logar com: $email, $senha")
    }

    fun logar(numeroTelefone: String) {
        println("logar com: $numeroTelefone")
    }
}

fun main() {
    val usuario2 = Usuario2()
    usuario2.logar("jornalsinal@gmail.com", "123456")
    usuario2.logar("85998082829")
}