package com.example.mystudycodes25

import com.example.recursos.CarroUber
import com.example.recursos.Usuario

fun main() {
    val carro = Carro1()
    carro.acelerar()

    //como Carro2 é private ele não é visivel nessa classe
    /*val carro2 = Carro2()
    carro2.acelerar()*/

    val usuario = Usuario()

    val carro2 = CarroUber()
    carro2.finalizarViagem()

}