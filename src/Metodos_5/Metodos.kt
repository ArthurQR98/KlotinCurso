package Metodos_5
fun main() {
    var z:Int = 10
    println("The value of X is -- ${doubleMe(z)}")
    println("Ejemplo de break y continuar")
    for(x in 1..10){
        if (x == 2){
            println("I am inside if block with value" + x + "\n--hence it will close the operation")
            break
        }else{
            println("I am inside else block with value $x")
            continue
        }
    }
    var nombre:String = "Arthur"
    println(nombre[0])
}
fun doubleMe(z:Int):Int {
    return z*2
}
