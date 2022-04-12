package com.tozzz.kotlindersleri.paket2

import com.tozzz.kotlindersleri.paket1.A

class B : A() {
    fun fonksiyon(){
       // val a = A()

        println(publicDegisken)
        println(varsayilanDegisken)
        println(protectedDegisken) //kalıtım aldıktan sonra protected e de erişiyoruz.
    }
}