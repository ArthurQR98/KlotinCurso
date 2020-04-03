package Matrices_4

fun main(){
    /*
    Matrices
     */
    val numbers: IntArray = intArrayOf(1,2,3,4,5)
    println("Hola este el ejemplo " + numbers[2])

    /*
    Colecciones
     */
    val numeros: MutableList<Int> = mutableListOf(1,2,3,4) //mutable

    val readOnlyView: List<Int> = numeros //inmutable

    println("Mi mutable list -- " + numeros)
    numeros.add(5)
    println("Mi mutable despues de la edicion" + numeros)
    println(readOnlyView)

    println("ACA EMPIEZA OTRA COSA")
    val items = listOf<Int>(1,2,3,4)
    println("First element of our list---- "+items.first())
    println("Last element of our list---- "+items.last())
    println("Even element of our list----"+items.
    filter { it % 2 == 0 })
    val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
    println(readWriteMap["foo"])

    val strings = hashSetOf("a","b","c","c")
    println("My set values are "+ strings)

}