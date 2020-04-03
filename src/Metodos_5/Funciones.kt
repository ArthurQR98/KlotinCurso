package Metodos_5
fun main() {
    fibonacci( 0 , 1 )
}
fun fibonacci( casoBase0:Int , casoBase1:Int ){
    var a = casoBase0
    var b = casoBase1
    println( "Indice en la serie de fibonacci 1, valor:" + casoBase0 )
    println( "Indice en la serie de fibonacci 2, valor:" + casoBase1 )
    for( i in 3..18 ){
        var serie = a + b
        a = b
        b = serie
        println( "Indice en la serie de fibonacci $i, valor:" + serie )
    }
}