package com.absdev.android.imersaoandroidaula01

interface Aquatico {
    fun nadar()
}

open class Animal(){
    var cor = ""

    open fun correr(){
        println("correr")
        println("como")
        println("um")
    }
}

class Cao : Animal(), Aquatico{
    override fun correr(){
        super.correr()
        println("cão")
        println("com as 4 patas")
    }

    override fun nadar() {
        println("nadando como um cachorro")
    }
}

class Gato : Animal(), Aquatico{
    override fun correr(){
        super.correr()
        println("gato")
        println("saltando e ágil")
    }

    override fun nadar() {
        println("nadando como um gato")
    }
}

fun main(){

    val cao1 = Cao()
    cao1.cor = "marron"
    cao1.correr()
    cao1.nadar()

    val gato1 = Gato()
    gato1.cor = "branco"
    gato1.correr()
    gato1.nadar()

//    val s = "Aula 01"
//
//    println(s)
//
//    val numero1 = 10
//    val numero2 = 10
//
//    println(numero1 + numero2)
//    println(numero1 == numero2)
//    println(numero1 != numero2)
//
//    val compraMinima = 100
//    val compra = 50
//
//    println(compra >= compraMinima)
//
//    if (compra >= compraMinima){
//        print("desconto aplicado")
//    } else {
//        print("sem desconto")
//    }

//    val listaNomes = listOf("João","Maria","Sofia")
//    //print(listaNomes[2])
//
//    //depois praticar while, do while, foreach
//    for ( nome in listaNomes){
//        println(nome)
//    }
}