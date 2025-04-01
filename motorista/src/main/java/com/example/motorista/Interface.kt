package com.example.motorista

interface Presidenciavel {
    fun candidatarSe()
}

abstract class Pessoa() {
    fun comer() = println("comer")
    //abstract fun candidatarSe()
}

class DesenvolvedorAndroid : Pessoa() {
    fun programar() = println("programar")
}
class DesenvolvedorWeb : Pessoa() {
    fun programar() = println("programar")
}
class Jornalista() : Pessoa (), Presidenciavel {
    fun escreverNoticia() = println("Escrever notícia")
    override fun candidatarSe() {
        println("candidatar-se a presidente")
    }
}
class FuncionarioPublico : Pessoa() {
    fun tomaCafeEConversa() = println("toma café e conversa")
}

fun main() {
    val desenvolvedorAndroid = DesenvolvedorAndroid()
    desenvolvedorAndroid.comer()

    val desenvolvedorWeb = DesenvolvedorWeb()
    desenvolvedorWeb.programar()

    val jornalista = Jornalista()
    jornalista.candidatarSe()

    val funcionarioPublico = FuncionarioPublico()
    funcionarioPublico.tomaCafeEConversa()
}
