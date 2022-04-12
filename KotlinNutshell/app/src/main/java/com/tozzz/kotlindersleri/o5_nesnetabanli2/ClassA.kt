package com.tozzz.kotlindersleri.o5_nesnetabanli2

class ClassA :MyInterface {
    override val degisken: Int = 10

    override fun metod1() {
    println("Metod1 Çalıştı")
    }

    override fun metod2(): String {
        return "Metod2 Çalıştı"

    }


}