package Condicionales_2
fun main() {
    val calificacion = 5
    var comentario:String

    when(calificacion){
        1 -> comentario = "No me gusto la comida"
        2 -> comentario = "La bebida estuvo buena"
        3 -> comentario = "Mediocre"
        4 -> comentario = "Me gusto pero puede mejorar"
        5 -> comentario = "La mejor comida Peruana"

        else -> comentario = "Comentario mal escrita"
    }
    print(comentario)
}
