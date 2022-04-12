package com.tozzz.kotlindersleri.o6_collections

data class Ogrenciler(var no: Int, var ad: String, var sinif: String) {
}


/*
          ~~Mutable Collections~~
        • Mutable özelliği diziler hem yazılabilir hem okunabilir.
        • Mutable olmayan diziler sadece okunabilir.
        • Böyle bir ayrım yapmalarının sebebi kodlama yaparken büyük çoğunlukla veri tabanlarından
          alınan dizileri okuma işlemi yapmamız diyebiliriz.
        • Performansı artırmak amaçlanmıştır.

        listOf()  -> Sadece okunabilir yapıdadır.
        ArrayList -> List’in mutable versiyonudur.
                     Aynı türde verileri bir arada tutar.
                     İndeks numaraları 0 dan başlar.


                ~~Set ( HashSet )~~
            • ArrayList ile aynı özelliklere sahiptir.
            • İçine eklenen veriler düzensiz rasgele yerleştirilir.
            • İndeks değerlerinin takibi zordur.
            • Mutable üzerinde değişiklik yapılır demektir.
            • setof : Sadece üzerinden veri okunur demektir.

            Nesne Tabanlı - Set
            • Set yapı itibari ile içine insert edilen verileri rasgele sıralamaktadır.
            • Bu rasgele sıralama ınt,string içeren set gibi ifadelerde kolaylıkla
              yapılabiliyor.
            • Fakat set içine nesne yerleştirildiğinde nesne içindeki hangi değişkene
              göre bu rasgele sıralamayı yapacağını belirtmemiz gerekiyor.
            • Örn : Öğrencinin nosuna göre mi ? adına göre mi ? sınıfına göre mi ?
              sıralama yapılacak

              ~~Map ( HashMap )~~
            • Key ve value ilişkisi ile çalışır.
            • Key ile verilere erişiriz.
            • Mutable olmazsa map üzerinde değişiklik yapılamaz
 */