package Poo_6
class ArthurDev{
    /*
    Atributos
     */
    var nombre:String = "Arthur"
    var edad:Int = 22
    var Pais:String = "Peru"

    /*
    Metodos
     */
    fun ImprimirDatos(){
        return println("Mi es $nombre tengo $edad y soy del pais de $Pais")
    }
}
fun main() {
    val obj = ArthurDev()
    obj.ImprimirDatos()
}

