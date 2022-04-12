package com.tozzz.kotlindersleri.o3_standartprogramlama

fun main() {
    val a = 40
    val b = 50

    val x = 70
    val y = 80

    println("a == b : ${a == b}")
    println("a != b : ${a != b}")
    println("a > b  : ${a > b}")
    println("a >= b : ${a >= b}")
    println("a < b  : ${a < b}")
    println("a <= b : ${a <= b}")

    println("a > b || x > y : ${a > b || x > y }") //OR (veya) iki koşuldan biri sağlanıyorsa true
    println("a > b && x > y : ${a > b && x > y }") //AND (ve) her iki koşulu da sağlıyorsa true
                                                   //NOT (!s) var olan durumun tersine döndürür.

}