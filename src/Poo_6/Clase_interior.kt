package Poo_6
fun main() {
    val demo = Hombre().Mujer().present()
    println(demo)

}
class Hombre{
    private val presentacion:String = "Hola me llamo Arthur"
    /*
    Creando una clase interior
     */
    inner class Mujer{
        fun present() = presentacion
    }
}
