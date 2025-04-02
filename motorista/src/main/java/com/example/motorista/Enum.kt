package com.example.motorista

enum class StatusPedido {
    AGUARDANDO_APROVACAO,//0
    PEDIDO_REALIZADO,//1
    PAGAMENTO_CONFIRMADO,//2
    PEDIDO_ENVIADO,//3
    PEDIDO_ENTREGUE//4
}

class Pedido (
    var total: Double = 0.0,
    var itens: String = "",
    var statusPedido: StatusPedido = StatusPedido.AGUARDANDO_APROVACAO
) {

}

fun main() {
    val pedido = Pedido(125.90, "camiseta, livro")
    pedido.statusPedido = StatusPedido.PEDIDO_REALIZADO

    pedido.statusPedido = StatusPedido.PEDIDO_ENVIADO

    println("StatusPedido: ${StatusPedido.PEDIDO_ENVIADO}")
    println("StatusPedido: ${StatusPedido.PEDIDO_ENVIADO.ordinal}")

    if ( pedido.statusPedido == StatusPedido.PEDIDO_REALIZADO) {
        println("O seu pedido foi realizado")
    } else if (pedido.statusPedido == StatusPedido.PAGAMENTO_CONFIRMADO) {
        println("O seu pagamento foi confirmado")
    } else if (pedido.statusPedido == StatusPedido.PEDIDO_ENVIADO) {
        println("O seu pedido foi enviado")
    } else if (pedido.statusPedido == StatusPedido.PEDIDO_ENTREGUE) {
        println("O seu pedido foi entregue")
    }
}