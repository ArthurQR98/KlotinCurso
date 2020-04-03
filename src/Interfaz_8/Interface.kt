package Interfaz_8
interface Interfaz {
    var name:String
    var edad:Int
    fun saludo(){
        print("Hey!! Hola, como estan!!")
    }
}
/*
SIEMPRE QUE SE IMPLEMENTA UNA INTERFAZ SIEMPRE SE SOBRE ESCRIBE
LOS DATOS O VARIABLES.
Es como si fuera una plantilla.
 */
class Implementacion:Interfaz{
    override var name:String = "Arthur"
    override var edad:Int = 22
}
fun main() {
    var Persona = Implementacion()
    println("---- Datos de la Persona ---")
    println("${Persona.saludo()}")
    println("Mi nombre es ${Persona.name}")
    println("Tengo la edad de ${Persona.edad} años")
}