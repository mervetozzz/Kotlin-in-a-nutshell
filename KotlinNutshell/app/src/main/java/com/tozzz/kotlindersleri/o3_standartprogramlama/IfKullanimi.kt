package com.tozzz.kotlindersleri.o3_standartprogramlama

fun main() {
    val yas = 19
    val isim = "Mehmet"

    if (yas >= 18) {
        println("Reşitsiniz..")
    }else{
        println("Reşit değilsiniz..")
    }

    //IF YAPISININ PRATİK HALİ
    //İf ( Koşul ) Doğru Sonuç else Yanlış Sonuç
    if (yas >= 18) println("Reşitsiniz..") else println("Reşit değilsiniz..")

    println("~~~~~~~~~~~~~~~~~~~~~~~~")

    if (isim == "Ahmet"){
        println("Merhaba Ahmet")
    }else if (isim == "Mehmet"){
        println("Merhaba Mehmet")
    }else{
        println("Tanınmayan kişi")
    }

    println("~~~~~~~~~~~~~~~~~~~~~~~~")


    val ka = "admin"
    val sifre = 12345

    if (ka == "admin" && sifre  == 12345){
        println("Hoşgeldiniz")
    }else{
        println("Hatalı Giriş")
    }

    println("~~~~~~~~~~~~~~~~~~~~~~~~")

    val sayi = 10
    if (sayi == 10 || sayi == 20){
        println("Sayı 10 veya 20 dir")
    }else{
        println("Sayı 10 veya 20 değildir")
    }

    println("~~~~~~~~~~~~~~~~~~~~~~~~")



}