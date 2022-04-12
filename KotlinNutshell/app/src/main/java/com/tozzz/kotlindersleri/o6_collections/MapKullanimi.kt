package com.tozzz.kotlindersleri.o6_collections

fun main() {
    val iller = HashMap<Int,String>()

    //VERİ EKLEME
    iller.put(16,"Bursa")
    iller[34] = "İstanbul"
    iller[6] = "Ankara"

    println(iller.toString())

    //VERİ OKUMA
    println(iller.get(16))

    //GÜNCELLEME
    iller.put(16,"YeniBursa")
    println(iller.toString())

    println(iller.size)
    println(iller.isEmpty())

    for ((anahtar,deger) in iller) {
        println("$anahtar -> $deger")
    }
        iller.remove(34)
        println(iller.toString())

        iller.clear()
        println(iller.toString())

}