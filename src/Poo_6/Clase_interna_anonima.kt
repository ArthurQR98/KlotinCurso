package Poo_6
fun main() {
    var programador:Human = object : Human {
        override fun message() {
            println("Yo soy un ejemplo de clase interior anonima")
        }
    }
    programador.message()
}
interface Human{
    fun message()
}
