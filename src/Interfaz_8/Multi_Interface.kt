package Interfaz_8
interface A{
    fun luchar(){
        println("Vamos a salir de esto!!")
    }
}
interface B{
    fun Ganamos(){
        println("Salimos de esto gente!! - Ganamos la batalla contra " +
                "el coronavirus!!")
    }
}
class Implementation:A,B // Se implementa dos interfaces

fun main() {
    var Peru = Implementation()
    Peru.luchar()
    Peru.Ganamos()
}
