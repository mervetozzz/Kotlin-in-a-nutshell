package com.tozzz.kotlindersleri.o4_nesnetabanli1

class Fonksiyonlar {
    fun selamla1() {
        val sonuc = "Merhaba Ahmet"
        println(sonuc)
    }

    fun selamla2(): String {
        val sonuc = "Merhaba Ahmet"
        return sonuc
    }

    fun selamla3(isim: String) {
        println("Merhaba $isim")
    }

    fun toplam(sayi1: Int, sayi2: Int): Int {
        val toplam = sayi1+sayi2
        return toplam
    }

    /*           OVERLOADİNG
        • Metodların ayni isimde tekrar kullanılması.
        • Tek şart metodun parametre dizilimindeki türlerin farklı olmasıdır.
        • Metodların kullanımında parametre çeşitliliği sağlar.
    */

    fun carp(sayi1: Int,sayi2: Int){
        println("Çarpma : ${sayi1*sayi2}")
    }

    fun carp(sayi1: Double,sayi2: Int){
        println("Çarpma : ${sayi1*sayi2}")
    }

    fun carp(sayi1: Int,sayi2: Int, isim :String){
        println("Çarpma : ${sayi1*sayi2} - İşlem yapan : $isim")
    }


    //vararg Parametrele  //İstenildiği kadar veri girilebilen parametre
}