package Rangos_3
fun main() {
    val a:Int = 2
    val b:Int = 3

    fun suma():Int{
        return  a+b
    }

    println("Esta es la suma de a + b = ${suma()}")

    val i:Int = 5
    /*
    Rango , crea un recorrido desde 1 al 6
     */
    for (j in 1..6)
    println(j)
    /*
    Si el valor de i esta dentro de ese rango que imprima
     */
    if(i in 1..10)
        println("we found your number --  $i" )


}