package com.tozzz.kotlindersleri.o2_degiskenler

import kotlin.random.Random

fun main() {
    /*                  DİZİLER
        • Çoklu değişken oluşturmak gibi düşünebilirsiniz.
        • Sabit boyutlu bir yapıdır.Baştan ne kadar boyutu olduğu bellidir
        • Indeks numaralarına göre veriler eklenir.
        • İlk indeks numarası 0’dan başlar.
        • Mutable yapıdadır.
        • Hem okunabilir hem üzerinde işlem yapılabilir.
*/

    println("~~~~~~~~~~ARRAY TANIMLAMA~~~~~~~~~~")
    var dizi1 = Array<Int>(5) { 0 }  //5 elemanlı boş dizi
    var dizi2 = arrayOf<Int>(1, 10, 25, 36, 48)
    var dizi3 = arrayOf(1, 20, 5, "Elma", "Armut")
    var dizi4 = arrayOf<String>("çilek", "muz", "elma")


    println("~~~~~~~~~~ARRAY VERİLERİNE ERİŞİM~~~~~~~~~~")
    println(dizi4.get(2))   //elma
    println(dizi3[1])       //20

    println("~~~~~~~~~~ARRAY VERİ EKLEME~~~~~~~~~~")
    var meyveler = arrayOf<String>("Çilek", "Muz", "Elma", "Kivi")

    println("~~~~~~~~~~Boş mu dolu mu~~~~~~~~~~")
    println(meyveler.isEmpty())

    println("~~~~~~~~~~Dizi boyutu~~~~~~~~~~")
    println(meyveler.count())

    println("~~~~~~~~~~Dizinin ilk elemanı~~~~~~~~~~")
    println(meyveler.first())

    println("~~~~~~~~~~Dizinin son elemanı~~~~~~~~~~")
    println(meyveler.last())

    println("~~~~~~~~~~Elemanın bulunduğu index numarasını~~~~~~~~~~")
    println(meyveler.indexOf("Muz"))

    println("~~~~~~~~~~Dizinin içinde bu eleman var mı~~~~~~~~~~")
    println(meyveler.contains("Muz"))

    println("~~~~~~~~~~Diziyi sırala~~~~~~~~~~")
    println(meyveler.sort())
    println(meyveler.contentToString())

    println("~~~~~~~~~~Diziyi tersten sırala~~~~~~~~~~")
    println(meyveler.reverse())
    println(meyveler.contentToString())

    println("~~~~~~~~~~  Döngüler ile Veri Çekme~~~~~~~~~~")
    for (meyve in meyveler){
        println("Sonuç : $meyve")
    }

    println("~~~~~~~~~~Rasgele sayı üretme~~~~~~~~~~")
    val randomValues = Random.nextInt(0,10)  //0 ile 9 arası
    println(randomValues)


}