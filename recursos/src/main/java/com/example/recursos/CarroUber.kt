package com.example.recursos

class CarroUber {

    fun finalizarViagem() {
        val usuario = Usuario()
        usuario.nome = "Jamela"
        println(usuario.nome)
        usuario.calcularPrecoCorrida()
        println("Finalizando viagem")
    }
}