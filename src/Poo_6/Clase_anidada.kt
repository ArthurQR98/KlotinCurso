package Poo_6
fun main() {
    val demo = Web.Pag().PageWeb()
    println(demo)
}
class Web{
    class Pag{
        fun PageWeb():String{
            val namePage:String = "Welcome a My PageWeb - wwww.arthur.com"
            return namePage
        }
    }
}