package com.tozzz.kotlindersleri.o6_collections

fun main() {
    val o1 = Ogrenciler(200,"Zeynep","9C")
    val o2 = Ogrenciler(300,"Ahmet", "11Z")
    val o3 = Ogrenciler(100,"Beyza", "12A")

    val ogrencilerListesi = ArrayList<Ogrenciler>()
    ogrencilerListesi.add(o1)
    ogrencilerListesi.add(o2)
    ogrencilerListesi.add(o3)

    for(o in ogrencilerListesi){
        println("No : ${o.no} - Ad : ${o.ad} - Sınıf : ${o.sinif}")
    }

    println("Filtreleme 1")
    val f1 = ogrencilerListesi.filter { it.no >= 200 }
    for(o in f1){
        println("No : ${o.no} - Ad : ${o.ad} - Sınıf : ${o.sinif}")
    }

    println("Filtreleme 2")
    val f2 = ogrencilerListesi.filter { it.ad.contains("yz") }
    for(o in f2){
        println("No : ${o.no} - Ad : ${o.ad} - Sınıf : ${o.sinif}")
    }

    println("Sayısal : Küçükten -> Büyüğe ")
    val s1 = ogrencilerListesi.sortedWith(compareBy { it.no }) //ascend -> asc
    for(o in s1){
        println("No : ${o.no} - Ad : ${o.ad} - Sınıf : ${o.sinif}")
    }

    println("Sayısal : Büyükten -> Küçüğe ")
    val s2 = ogrencilerListesi.sortedWith(compareByDescending { it.no }) //descend ->desc
    for(o in s2){
        println("No : ${o.no} - Ad : ${o.ad} - Sınıf : ${o.sinif}")
    }

    println("Harfsel : Küçükten -> Büyüğe ")
    val s3 = ogrencilerListesi.sortedWith(compareBy { it.ad })
    for(o in s3){
        println("No : ${o.no} - Ad : ${o.ad} - Sınıf : ${o.sinif}")
    }

    println("harfsel : Büyükten -> Küçüğe ")
    val s4 = ogrencilerListesi.sortedWith(compareByDescending { it.ad }) //descend ->desc
    for(o in s4){
        println("No : ${o.no} - Ad : ${o.ad} - Sınıf : ${o.sinif}")
    }
}