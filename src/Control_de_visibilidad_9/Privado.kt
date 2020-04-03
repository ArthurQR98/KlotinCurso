package Control_de_visibilidad_9
private class EventoPrivado{
    private var mujeres:String = "Heyyy!!!"
    private var hombres:String = "Siempre Listos!!"
    open fun EmpiezaTono(){
        println("Estamos listos!! $hombres y un grito las mujeres $mujeres")
    }
}
fun main() {
    var eventoPrivado = EventoPrivado()
    eventoPrivado.EmpiezaTono()
}
