package com.tozzz.kotlindersleri.o4_nesnetabanli1

fun main() {
    //Null safety - Nullable - Optional(swift tarafında)
    var str1 : String? = null

   // str1 = "Merhaba"

    //Yöntem 1 : ? Her ihtimale karşı garanti
    //println("Sonuç 1 : ${str1?.trim()}")

    //Yöntem 2: !! Koddan eminsen null gelmeyecekse kullanabilirsin
    //println("Sonuç 2 : ${str1!!.trim()}")

    //Yöntem 3:
    if (str1 != null){
        println("Sonuç 3 : ${str1.trim()}")
    }else{
        println("Sonuç null'dur.")
    }

    //Yöntem 4 :
    str1?.let {
        println("Sonuç 4 : ${it.trim()}")
    }
}

/*
        Nullable Type ?

        • Global değişken oluştururken değişkene belirli bir değer vermeden
          oluşturmak isteyebiliriz.
        • Örn : var str:String = 2 gibi bir değer yerine var str:String = null
        • Bu durumda null yapabiliriz.
        • Değişkeni ? İşareti ile tanımlamalıyız.
        • Tanımlandıktan sonra kullanılırken ? İşareti kullanılırsa null hatasından
          kaynaklı olabilecek çökmelerden korunur.
        • Tanımlandıktan sonra kullanılırken !! İşareti kullanılırsa bu değişkenin
          null olabileceğini belirtmiş oluruz.
 */