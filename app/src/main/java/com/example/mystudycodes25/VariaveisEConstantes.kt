package com.example.mystudycodes25

class Usuario {

    fun correr(){
        println("correndo")
    }

}

fun retornaNome () {
    println("Nome do Fulano de Tal")
}

//para usar const val tem que ser fora da função, ela é uma variável global, tempo de compilação
const val nomeCompleto = "Fulano de Tal"
//para uma const não podemos retornar uma função na declaração, ex. linha 10
//const val nome = retornaNome()
//mas para uma variável local eu posso fazer isso, ex. linha 47

fun main() {
    var a = "a"
    val c = "c" //variável imútavel local, dentro da função, tempo de execução
    a = "b"
    //a linha 8 da erro, pq c é uma constante
    //c = "d"
    println(a)
    println(c)

    //declarando o tipo da variavel
    var e: String = "eee"
    //acessando recursos da classe String, ex: linha 15
    println(e.length)
    //se não passar o tipo declarado da erro, ex: linha 17
    //var f: Int = "f"

    //Tipos de variáveis (inferência automática)
    /***
     * Byte -128 e 127
     * Short -32.768 e 32.767
     * Int -2.147.483.648 e 2.147.483.647
     * Long -9.223.372.036.854.775.808 e 9.223.372.036.854.775.807
     * Float Números com até 7 casas decimais
     * Double Números com até 15 casas decimais
     * Boolean Armazena valores verdadeiro ou falso
     * Char Armazena 1 caracter
     */

    //para usar const val não se deve declarar ela dentro da função, ela não é uma váriavel local, linha 32 vai dar erro
    //const val nomeCompleto = "Fulano de Tal"

    //imprimindo nomeCompleto global
    println(nomeCompleto)

    val nome = retornaNome()
    println(nome)

    //instanciando um objeto da classe Usuario
    val usuarioA = Usuario()
    usuarioA.correr()

}