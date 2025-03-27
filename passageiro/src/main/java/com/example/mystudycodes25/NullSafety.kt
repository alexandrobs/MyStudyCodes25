package com.example.mystudycodes25

class Carro {
    var cor = "Vermelho"

    fun acelerar(){

    }
}

fun main() {
    //criar variavel String que aceita valor nulo
    var nome: String? = null

    println(nome)

    //usando inferência de tipo
    val carro = Carro()
    println(carro.cor)

    //passar o tipo explicito é redundante
    val carro2: Carro = Carro()
    println(carro2.cor)

    //inicializar a variavel com nulo como aqui é redundante
    //pq a classe já tem ?, mostrando que pode aceitar um valor nulo
    var carro3: Carro? = null
    carro3 = Carro()
    println(carro3.cor)

    var carro4: Carro?
    carro4 = Carro()
    println(carro4.cor)

    //inicializar a variavel com nulo como aqui é redundante, porém nesse caso é necessário
    // para poder chamar o atributo de carro5 (usando ? ou !!), caso contrário ele não compila porque não foi ]
    // inicializado carro5, exemplos linha 41 a 45 de não compilados e linha 38 a 39 que compila e executa NPE*
    var carro5: Carro? = null
    //println(carro5!!.cor)

//    var carro6: Carro?
//    println(carro6!!.cor)
//
//    var carro7: Carro?
//    println(carro7?.cor)

    //chamada segura compila e executa sem NPE como com !! que diz que não virá nulo e coloca um nulo,
    // gerando NPE em tempo de execução
    println(carro5?.cor)

    //usando um if para testar se é nulo a variável, chamando cor sem a chamada segura
    if (carro5 != null) {
        println(carro5.cor)
    }

    //para não mostrar null para o usuário quando for nulo a instanciação do objeto carro
    //verificação com Safety Null usando Elvis operator
    val cor = carro5?.cor ?: "cor padrão"
    println(cor)

}