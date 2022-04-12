package com.tozzz.kotlindersleri.o3_standartprogramlama

fun main() {

    println("~~~~~~~~~~ALAN HESAPLAMA~~~~~~~~~~")
    print("Dikdörtgen : 1 \n" +
            "Çember     : 2 \n" +
            "Seçiminiz  : ")
    val sekil : Int= readLine()!!.toInt()

    if (sekil == 1){
        print("Kısa kenarı giriniz : ")
        val kisa : Int= readLine()!!.toInt()
        print("Uzun kenarı giriniz : ")
        val uzun : Int= readLine()!!.toInt()
        print("Dikdörtgenin Alanı : ${kisa*uzun}")
    }else if (sekil == 2){
        print("Yarıçapı giriniz : ")
        val cap : Int= readLine()!!.toInt()
        print("Çemberin Alanı : ${3.14 * cap * cap}")

    }else{
        println("Yanlış seçim yaptınız..")
    }


    println("~~~~~~~~~~BASİT HESAP MAKİNESİ~~~~~~~~~~")
    println("Toplama   : 1 \n" +
            "Çıkartma  : 2 \n" +
            "Çarpma    : 3 \n" +
            "Bölme     : 4 ")
    print("İşlem seçiniz : ")
    val islem : Int= readLine()!!.toInt()
    print("Birinci sayıyı giriniz : ")
    val sayi1 : Int= readLine()!!.toInt()
    print("İkinci sayıyı giriniz  : ")
    val sayi2 : Int= readLine()!!.toInt()

    when(islem) {
        1 -> println("${sayi1 + sayi2}")
        2 -> println("${sayi1 - sayi2}")
        3 -> println("${sayi1 * sayi2}")
        4 -> println("${sayi1 / sayi2}")
    }


    println("~~~~~~~~~~TEKRAR~~~~~~~~~~")
    print("İsim giriniz : ")
    val isim : String?= readLine()
    print("Tekrar sayısı giriniz : ")
    val tekrar : Int= readLine()!!.toInt()
    var sayac = 1
    while (sayac<tekrar+1){
        println("$sayac. $isim")
        sayac++
    }







}