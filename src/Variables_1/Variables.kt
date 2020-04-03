package Variables_1

fun main(){
    println("Hola mundo")

    // val => es una variable fina esto quiere decir que no lo puedes modificar.
    // var => es una variable mutable esto quiere decir que el valor asignado puede cambiar.

    val a: Int = 10000
    val b: Double = 100.00
    val f: Float = 100.00f
    val l: Long = 1000000004
    val s: Short = 10
    val d: Byte = 1

    println("Este es valor Int is $a")
    println("Este es valor Double is $b")
    println("Este es valor Float is $f")
    println("Este es valor Long is $l")
    println("Este es valor Short is $s")
    println("Este es valor Byte is $d")

    val letter: Char
    letter = 'A'
    println("Es una variable de tipo Char $letter")

    /*
    Booleanos
     */
    val alejandra:Boolean
    alejandra = false
    println("Alejandra es $alejandra")

    /*
    String o estrumentos de cuerda
     */
    var rawString : String = "Yo soy una cadena sin procesar!"
    val escapedString :String = "Yo soy cadena escapa!\n"
    println("Hola! $rawString")
    println("Hey!! $escapedString")

}