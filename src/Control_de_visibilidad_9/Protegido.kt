package Control_de_visibilidad_9
open class A(){
    protected val i = 1
}
class ImplementandoPro : A() {
    fun value(){
        print(i)
    }
}

fun main() {
    var numero = ImplementandoPro()
    numero.value()
}