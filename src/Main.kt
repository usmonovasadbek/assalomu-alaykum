//fun main() {
//    val doira = Circle("Qizil", 5.0)
//    println(doira)
//    println("Maydon: ${doira.maydon()}")
//    println("Rang: ${doira.rangniOl()}")
//
//    val tortburchak = Rectangle("Ko'k", 4.0, 6.0)
//    println(tortburchak)
//    println("Maydon: ${tortburchak.maydon()}")
//    println("Rang: ${tortburchak.rangniOl()}")
//}
//
//abstract class Shape(val rang: String) {
//    abstract fun maydon(): Double
//
//    abstract override fun toString(): String
//
//    fun rangniOl(): String {
//        return rang
//    }
//}
//
//class Circle(rang: String, val radius: Double) : Shape(rang) {
//    override fun maydon(): Double {
//        return Math.PI * radius * radius
//    }
//
//    override fun toString(): String {
//        return "Radiusi $radius va rangi $rang bo'lgan doira"
//    }
//}
//
//class Rectangle(rang: String, val uzunlik: Double, val kenglik: Double) : Shape(rang) {
//    override fun maydon(): Double {
//        return uzunlik * kenglik
//    }
//
//    override fun toString(): String {
//        return "Uzunligi $uzunlik, kengligi $kenglik va rangi $rang bo'lgan to'rtburchak"
//    }
//}

fun main() {
    val abonentlar = arrayOf(
        Abonent(1, "Olimov", "Ali", 30, 50),
        Abonent(2, "Karimov", "Bek", 20, 10),
        Abonent(3, "Usmonov", "Dilshod", 40, 60),
        Abonent(4, "Xolmatov", "Eshmat", 50, 0),
        Abonent(5, "Sodiqov", "Farhod", 15, 15)
    )

    println("Shaharlararo suhbat vaqti shahar suhbat vaqtidan ko'p bo'lgan abonentlar:")
    abonentlar.filter { it.getShaharlararoSuhbatVaqti() > it.getShaharSuhbatVaqti() }
        .forEach { it.chiqazish() }

    println("\nAbonentlar ro'yxati alfavit tartibida:")
    abonentlar.sortedBy { it.getFamilya() }
        .forEach { it.chiqazish() }

    println("\nShaharlararo suhbatdan foydalanmagan abonentlar:")
    abonentlar.filter { it.getShaharlararoSuhbatVaqti() == 0 }
        .forEach { it.chiqazish() }
}

class Abonent {
    var abonentId: Int? = null
        get() = field
        set(value) {
            field  = value
        }

    var familya: String,
    var ism: String,
    var shaharSuhbatVaqti: Int,
    var shaharlararoSuhbatVaqti: Int

}





