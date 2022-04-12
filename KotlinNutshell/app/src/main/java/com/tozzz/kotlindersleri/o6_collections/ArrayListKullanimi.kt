package com.tozzz.kotlindersleri.o6_collections

fun main() {

    val meyveler = ArrayList<String>()

    //Veri Ekleme
    meyveler.add("Elma")   // 0. index
    meyveler.add("Muz")    // 1. index
    meyveler.add("Kiraz")  // 2. index

    println(meyveler.toString())

    //Güncelleme
    meyveler[1] = "Yeni Muz"
    println(meyveler.toString())

    //Insert
    meyveler.add(1,"Portakal")
    println(meyveler.toString())

    //Okuma İşlemi
    println(meyveler.get(2))
    println(meyveler[3])

    println(meyveler.size)       //Boyut
    println(meyveler.isEmpty())  //Boş kontrol
    println(meyveler.contains("Kiraz"))

    for (meyve in meyveler){
        println("Sonuç 1 : $meyve")
    }

    for((index,meyve) in meyveler.withIndex()){
        println("$index. -> $meyve")
    }

    meyveler.removeAt(2)
    println(meyveler.toString())

    meyveler.clear()
    println(meyveler.toString())
}