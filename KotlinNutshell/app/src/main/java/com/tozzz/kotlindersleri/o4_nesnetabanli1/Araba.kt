package com.tozzz.kotlindersleri.o4_nesnetabanli1

class Araba(var renk: String, var hiz: Int, var calisiyorMu: Boolean) {

    init {
        println("Constructor Çalıştı..")
    }

    //Tekrarlanan kod yapısının önüne geçmek için fonksiyonları kullanırız.
    fun bilgiAl() {
        println("~~~~~~~~~~")
        println("Renk         : $renk")
        println("Hız          : $hiz")
        println("Çalışıyor mu : $calisiyorMu")
    }

    fun calistir(){
        calisiyorMu = true
        hiz = 5
    }

    fun durdur(){
        calisiyorMu = false
        hiz = 0
    }

    fun hizlan(kacKm :Int){
        hiz += kacKm    //hiz = hiz + kacKm
    }

    fun yavasla(kacKm : Int){
        hiz -= kacKm
    }
}

/* iki tür fonksiyon vardır. Bunlar geri dönüş değeri olan ve geri dönüş değeri olmayan fonksiyonlardır.
   -> Sadece yaptırılmak istenen işlemi yapan metodu kullanana veri döndürmeyen fonksiyonlardır.
   -> Yapılan işlem sonucunda metodu kullanana veri dönüşü yapan (return) fonksiyonlardır.
 */

