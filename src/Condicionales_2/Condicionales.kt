package Condicionales_2
fun main() {
    val x:Int = 5

    /*
    Evalua si el dato corresponde al valor para poder
    agregar esa linea de String x == 1 o x == 2.
     */
    when(x){
        5 -> println("x == 1")
        2 -> println("x == 2")
        else ->{
        println("x is neither 1 nor 2")
    }
    }
    println(prueba())
    println(modificado())
    println(bucle())
    println(BucleWhileandBucleDoWhile())
}
fun prueba(){
    val a:Int = 5
    val b:Int = 2
    var c:Int = -2
    var max:Int

    /*if (a >= 0){
        println("$a es mayor que cero")
    }
     */

    /*if (b >= 4){
        println("$b es mayor que 4")
    }
     */
    /*
    if (c <= 0){

        println("$c no es mayor que cero")
    }
    */

    if (a > b){
        max = a
    } else {
        max = b
    }
    println("El numero maximo entre A y B es = $max")
}
fun modificado(){
    val x:Int = 5
    when(x) {
        1,2 -> println("Value of X either 1,2")
        else -> {
            println("x is neither 1 nor 2")
        }
    }
}
fun bucle(){
    val items = listOf<String>("Laly","Alexandra","Alejandra","Darlene","Daphne")
    for (i in items)
        println("Nombre de chicas lindas $i")

    for ((index,value) in items.withIndex()){
        println("Las chicas con su $index is $value")
    }
}
fun BucleWhileandBucleDoWhile(){
    var x:Int = 0
    println("Ejemplo de while loop -- ")
    /*
    while (x <= 10){
        println(x)
        x++
    }
     */
    println("Ejemplo de Doo-While loop --")
    do {
        x = x + 10
        println("I am inside Do block -- "+x)
    } while (x <= 50)

}

