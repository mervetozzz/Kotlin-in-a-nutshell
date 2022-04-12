package com.tozzz.kotlindersleri.o3_standartprogramlama

fun main() {
    val gun = 8

    when(gun){
        1 -> println("Pazartesi")
        2 -> println("Salı")
        3 -> println("Çarşamba")
        4 -> println("Perşembe")
        5 -> println("Cuma")
        6 -> println("Cumartesi")
        7 -> println("Pazar")
        else -> println("Böyle bir gün yok")
    }
}
/*
    Switch yapısının adı değişmiş halidir.
    else if yapısının daha pratik kullanımıdır.
    Case denilen durumlar sağlanırsa kod çalışır. Itemlar, menü olaylarında sık kullanılır.
*/