package com.tozzz.kotlindersleri.o3_standartprogramlama

fun main() {
    // Döngüler belirli kodları tekrarlı çalıştırma amaçlı yapılardır.
    // Örneğin ; veri tabanından gelen verileri işlemek gibi.

    println("~~~~~~~~~1,2,3~~~~~~~~~~~")
    //.. range anlamına geliyor 1den başlayıp 3 e kadar gider
    for (i in 1..3) {
        println("Döngü 1 : $i")
    }

    println("~~~~~~~~~10 ile 20 arasında 5er artsın~~~~~~~~~~~")
    //step kaçar kaçar ilerlemesi gerektiği
    for (a in 10..20 step 5) {
        println("Döngü 2 : $a")
    }

    println("~~~~~~~~~20 ile 10 arasında 5er azalsın~~~~~~~~~~~")
    //downTo geriye doğru
    for (b in 20 downTo 10 step 5) {
        println("Döngü 3: $b")
    }

    println("~~~~~~~~~1,2,3,4,5~~~~~~~~~~~")
    var sayac = 1
    while (sayac < 6){
        println("Döngü 4 : $sayac")
        sayac++
    }

    println("~~~~~~~~~break~~~~~~~~~~~")
    for (i in 1..5){
        if (i == 3){
            break
        }
        println("Döngü 5 : $i")
    }

    println("~~~~~~~~~continue~~~~~~~~~~~")
    //O anki adımı boş geçer bir sonraki adımı çalıştırır.
    for (i in 1..5){
        if (i == 3){
            continue
        }
        println("Döngü 6 : $i")
    }

    //until otomatik olarak dizilerdeki indeks değerini 1 azaltarak alır.
    //for(t in 0 until test.size){...}

}