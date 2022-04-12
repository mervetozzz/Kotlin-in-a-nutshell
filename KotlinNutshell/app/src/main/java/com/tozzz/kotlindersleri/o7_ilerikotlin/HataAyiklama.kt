package com.tozzz.kotlindersleri.o7_ilerikotlin

import java.lang.Exception

fun main() {
    val x = 10
    val y = 0

    try {
        println("Sonuç : ${x/y}")
        println("İşlem tamam")
    }catch (e:Exception){
        println("İkinci sayıı sıfır olamaz")
    }
}
/*
        Exception nedir?
        1- Derleyici hatası(compiler error) : Derleme öncesi yakalanan hatalar
           örn: karakter hataları, syntax hataları
        2- Hata (Exception) : Çalışma anında(runtime) gerçekleşen hatalar
           örn: Sistem hataları, cihaz hataları, dosy bulunamadı, dizi indeksi aşıldı...


             TRY-CATCH
    • Derleme sırasında oluşabilecek hatalar için kullanılır.
    • Genelde kotlin input – output işlemleri için kullanılır. Yani veri alışveriş
      işlemlerinde kullanılır.
    • Kullanılacak yer mutlaka hata fırlatmalıdır.

 */