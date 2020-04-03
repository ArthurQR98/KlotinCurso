package Herencia_7
open class Bienvenido{
    open fun Saludo(){
        println("Hola a todos ya estamos!!")
    }
}
class Turista:Bienvenido(){
    override fun Saludo(){
        println("Hola soy Arthur vivo en Italia")
    }
}

fun main() {
    var Arthur = Turista()
    Arthur.Saludo()
}