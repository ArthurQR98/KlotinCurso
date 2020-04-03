package Herencia_7
open class ABC{
    fun message(){
        print("Hi my name is Arthur")
    }

}
class BCD:ABC(){
    //La clase BCD hereda de la clase padre ABC
}
fun main() {
    var a = BCD()
    a.message()
}
