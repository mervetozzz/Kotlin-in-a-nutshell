package com.tozzz.kotlindersleri.o4_nesnetabanli1

fun main() {
    val f = Fonksiyonlar()
    f.selamla1()
    val gelenSonuc = f.selamla2()
    println("Gelen Sonuç : $gelenSonuc")

    f.selamla3("Mehmet")

    val gelenToplam = f.toplam(100,200)
    println("Gelen Toplam : $gelenToplam")

    f.carp(5,4,"ece")
}