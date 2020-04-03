package Poo_6
class Carro(Color:String,Modelo:String,Precio:Int){
    var color:String = ""
    var modelo:String = ""
    var precio:Int = 0

    init {
        this.color = Color
        this.modelo = Modelo
        this.precio = Precio
    }
    fun Encendido(on:Boolean):Boolean{
        var On = on
        if(On == true){
            println("El auto esta encendido")
        }else{
            println("El auto no esta encendido")
        }
        return on
    }

}
fun main() {
    var Ferrari = Carro("Rojo","R20",120000)
    println(Ferrari.color)
    println(Ferrari.modelo)
    println(Ferrari.precio)
    Ferrari.Encendido(true)
}