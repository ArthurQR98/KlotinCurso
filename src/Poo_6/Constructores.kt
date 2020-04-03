package Poo_6
class Person(val name:String, var edad:Int){
}
class Humano(val name: String,var talla:Float){
    val message:String = "Hey!!!"
    constructor(name: String,talla: Float, message:String) : this(name, talla)
}

fun main() {
    val person1 = Person("Arthur",22)
    println("Nombre = ${person1.name}")
    println("Edad = ${person1.edad}")

    val humano = Humano("Arthur",1.80f)
    println("${humano.message} "+"${humano.name}"+" Welcome to the example of secundary constructor, Your stature is - ${humano.talla}")
}
