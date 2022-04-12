package com.tozzz.kotlindersleri.o4_nesnetabanli1

fun main() {
    val k1 = Kategoriler(1,"Dram")
    val k2 = Kategoriler(2,"Bilim Kurgu")

    val y1 = Yonetmenler(1,"Quentin Tarantino")
    val y2 = Yonetmenler(2,"Christopher Nolan")

    val f1 = Filmler(1,"Django",2013,k1,y1)

    println("Film Id : ${f1.film_id}")
    println("Film Ad : ${f1.film_ad}")
    println("Film Yılı : ${f1.film_yil}")
    println("Film Kategori : ${f1.kategori.kategori_ad}")
    println("Film Yönetmen : ${f1.yonetmen.yonetmen_ad}")
}