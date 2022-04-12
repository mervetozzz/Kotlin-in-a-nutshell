package com.tozzz.kotlindersleri.o5_nesnetabanli2

fun main() {
    val topkapiSarayi = Saray(5,300)
    val bogazVilla = Villa(true,10)

    println(topkapiSarayi.kuleSayisi)
    println(topkapiSarayi.pencereSayisi)

    println(bogazVilla.garajVarMi)
    println(bogazVilla.pencereSayisi)

    //11.04.2022
    //hangi sınıftan olduğunu kontrol etmek için
    if(topkapiSarayi is Saray){
        println("Saraydir..")
    }else{
        println("Saray değildir..")
    }

    //Upcasting
    //val ev : Ev = Saray(3,100)
    //Downcasting
    //val saray = Ev(5) as Saray
}