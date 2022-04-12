package com.tozzz.kotlindersleri.o2_degiskenler

fun main() {

    /*  DEĞİŞKENLERİ İSİMLENDİRME
        camelCase   -> ogrYas
        snake_case  -> ogr_yas
        -> Case sensitive’dir.Büyük küçük harf farkı vardır.
        -> Rakamla başlayamaz.
        -> @, $, ve % değişken içerisinde kullanılmaz.
    */



    var ogrenciAdi = "Ahmet"
    var ogrenciYas = 23
    var ogrenciBoy = 1.78
    var ogrenciBasharf = 'A'
    var ogrenciDevamediyorMu = true

    println(ogrenciAdi)
    println(ogrenciYas)
    println(ogrenciBoy)
    println(ogrenciBasharf)
    println(ogrenciDevamediyorMu)

    println("~~~~~~~~~~~~~~~~~~~~~~~~~~")

    var urun_id: Int = 3416
    var urun_adi: String = "Kol Saati"
    var urun_adet: Int = 100
    var urun_fiyat: Double = 149.99
    var urun_tedarikci: String = "Rolex"

    println("Ürün Id : $urun_id")
    println("Ürün Adı :  $urun_adi")
    println("Ürün Adet :  $urun_adet")
    println("Ürün Fiyat :  $urun_fiyat ₺")
    println("Ürün Tedarikçi   $urun_tedarikci")

    println("~~~~~~~~~~~~~~~~~~~~~~~~~~")

    //String ifade içine $ ifadesi kullanılarak çıktıya değişken eklenebilir.
    // String ifade içine ${} ifadesi kullanılarak işlem yapılabilir.

    var a = 10
    var b = 20

    println("$a x $b : ${a * b}")

    //SABİTLER
    var sayi = 30
    println(sayi)
    sayi = 100
    println(sayi)

    val numara = 90
    println(numara)
    //numara = 50
}
    /*
        -> Daha sonra değerini değiştirmeyecek değişkenler val olarak tanımlanmalı.
        -> Sabit olarak tanımladığımızda bellekte ayrılacak yer bellidir. Bellek yönetimini rahatlatır.
        -> String ifade içine $ ifadesi kullanılarak çıktıya değişken eklenebilir.


       --DATA BOYUTLARI (Rutin Bilgiler)--
                Type  | Size(bits)
                Byte  | 8 bit
                Short | 16 bit
                Int   | 32 bit
                Long  | 64 bit
                Float | 32 bit
                Double| 64 bit


                En çok kullanılan kaçış karakterleri.
                • \\ – \ işareti
                • \t – Bir tab boşluk bırakır
                • \n – Bir alt satıra iner
                • \” – Çift tırnak işareti
                • \’ – Tek tırnak işareti
    */