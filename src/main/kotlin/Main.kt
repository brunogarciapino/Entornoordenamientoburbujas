import java.util.*

fun ordenarBurbuja(listaNumeros: List<Int>, listaNumerosOrdenada: List<Int>): List<Int>{

    var contador1 = 0
    var contador2 = 1

    while (listaNumeros != listaNumerosOrdenada)
    {
        if (listaNumeros[contador1] > listaNumeros[contador2])
        {
            Collections.swap(listaNumeros,contador1,contador2)
            contador1++
            contador2++

            when
            {
                contador2 == listaNumeros.size ->
                {
                    contador1 = 0
                    contador2= 1 }
            }
        }
    }

    return listaNumeros

}



fun main() {

    val listaNumeros = mutableListOf<Int>()
    var numeroInput: Int = 0
    for (i in 1..10) {
        println("Introduce un $i numero")
        var valores = readLine()
        numeroInput = try {
            valores!!.toInt()
        } catch (e: Exception) {
            0
        }
        listaNumeros.add(numeroInput)
    }
    var listaNumerosOrdenada = listaNumeros

    println(listaNumeros)

    listaNumerosOrdenada.sort()

    println("")
    println("Ordenación según el método de ordenación burbuja")
    println("")

    println(ordenarBurbuja(listaNumeros, listaNumerosOrdenada))


}