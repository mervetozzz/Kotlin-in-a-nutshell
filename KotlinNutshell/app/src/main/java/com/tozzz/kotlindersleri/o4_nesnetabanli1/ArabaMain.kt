package com.tozzz.kotlindersleri.o4_nesnetabanli1

fun main() {
    //Nesne oluşturma ve değer atama
    val bmw = Araba("Mavi", 0, false)

    //Veri Okuma
    bmw.bilgiAl()

    //Veri Atama
    bmw.hiz = 50
    bmw.calisiyorMu = true

    bmw.bilgiAl()

    //Nesne oluşturma ve değer atama
    val sahin = Araba("Beyaz", 100, true)
    sahin.bilgiAl()

    //09.04.2022
    bmw.calistir()
    bmw.bilgiAl()
    bmw.durdur()
    bmw.bilgiAl()

    sahin.durdur()
    sahin.bilgiAl()
    sahin.hizlan(20)
    sahin.bilgiAl()

    bmw.hizlan(60)
    bmw.bilgiAl()
    bmw.yavasla(30)
    bmw.bilgiAl()
}