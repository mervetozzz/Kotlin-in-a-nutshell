package com.tozzz.kotlindersleri.odevler.odev2

class Sorular {

    //SORU 1
    fun derece(d: Double): Double {
        val fah = (d * 1.8) + 32
        return fah
    }

    //SORU 2
    fun dCevre(k1: Int, k2: Int) {
        val cevre = (k1 + k2) * 2
        println("Dikdörtgenin Çevresi : $cevre")
    }

    //SORU 3
    fun faktoriyel(sayi: Int): Int {
        var f = 1
        for (i in 1..sayi) {
            f *= i
        }
        return f
    }

    //SORU 4
    fun sayac(kelime: String, harf: Char) {
        val k = kelime.lowercase()
        val h = harf.lowercase()
        var i = 0
        var sayac = 0
        while (i < k.length) {
            if (h[0] == k[i]) {
                sayac++
                i++
            } else {
                i++
            }
        }
        println("$harf $sayac kez kullanılmıştır..")
    }

    //SORU 5
    fun aci(n: Int): Int {
        val acilar = (n - 2) * 180
        return acilar
    }

    //SORU 6
    fun maas(gun: Int): Int {
        val odeme : Int
        if (gun > 20){
            val normal = 20 * 8 * 10
            val mesai = (gun - 20) * 8 * 20
            odeme = mesai + normal
        }else{
            odeme = gun * 8 * 10
        }
        return odeme
    }

    //SORU 7
    fun kota(gb: Int): Int {
        var borc: Int = 100
        if (gb > 50) {
            borc += (gb - 50) * 4
        }
        return borc
    }

}