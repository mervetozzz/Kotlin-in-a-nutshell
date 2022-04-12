package com.tozzz.kotlindersleri.o2_degiskenler

import java.util.*

fun main() {
    //toDouble() , toFloat() , toLong() , toInt() , toShort() , toByte() , toChar() , toString()

    println("~~~~~~~~~~~~Sayısaldan sayısala  Dönüşüm~~~~~~~~~~~~")
    val i = 42
    val d = 78.95

    val sonuc1 = i.toDouble()
    println(sonuc1)

    val sonuc2 = d.toInt()
    println(sonuc2)
    println("~~~~~~~~~~~~Sayısaldan Metine Dönüşüm~~~~~~~~~~~~")
    val sonuc3 = i.toString() //"42"
    val sonuc4 = d.toString() //"78.95"
    println(sonuc3)
    println(sonuc4)

    println("~~~~~~~~~~~~Metinselden Sayısala Dönüşüm~~~~~~~~~~~~")
    val yazi = "67.54"
    val sonuc5 = yazi.toDoubleOrNull()

    if (sonuc5 != null) {
        println(sonuc5)
    } else {
        println("Dönüşümde hata oluştu!!! Sayınızı kontrol ediniz...")
    }

    sonuc5?.let {
        println(it)
    }

    println("~~~~~~~~~~~~ BONUS ~~~~~~~~~~~~")

    println("Adınızı Giriniz: ")
    val girdi = Scanner(System.`in`)
    val ad = girdi.next()
    println("Adınız : $ad")

    /*
    .next() -> Tüm türlerde girdi olabilir.
    Bunu sağlamak için girdiye uygun tür metodu seçilmelidir.
    Örn : int -> nextInt() , double -> nextDouble() vb.
    */

}