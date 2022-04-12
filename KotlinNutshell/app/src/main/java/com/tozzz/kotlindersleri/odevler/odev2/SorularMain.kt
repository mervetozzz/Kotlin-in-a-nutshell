package com.tozzz.kotlindersleri.odevler.odev2

fun main() {
    val cevaplar = Sorular()

    val derece = cevaplar.derece(51.0)
    println("$derece Fahrenhiet'dır")

    val faktoriyeli =  cevaplar.faktoriyel(5)
    println("Sayının Faktöriyeli : $faktoriyeli")

    cevaplar.dCevre(4,6)

    cevaplar.sayac("MervE",'E')

    val icAcilar =  cevaplar.aci(4)
    println("İç Açılar Toplamı : $icAcilar")

    val mesai = cevaplar.maas(21)
    println("Toplam Maaş : $mesai")

    val ucret = cevaplar.kota(55)
    println("Ücret : $ucret")
}