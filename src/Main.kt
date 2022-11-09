fun main() {

    var pJugador = Personaje()
    //Como el mercader siempre tiene que tener espacio suficiente y dinero suficiente para compra objetos
    var mercader = Personaje("Mercader",  0, arrayListOf(), mapOf(
        "1" to 10000,
        "5" to 10000,
        "10" to 10000,
        "25" to 10000,
        "100" to 10000))
    var arrval = arrayListOf<Int>()
    var cont = 0
    var valor = 0

    //Aqui te dejo elegir si quieres que el personaje sea aleatorio o lo crees tu
    do {
        println("¿Quieres que el personaje sea aleatorio? (S/N)")
        println("El tamaño de la mochila,los objetos y el dinero del personaje siempre seran aleatorios")
        var respuesta = readLine().toString()

        if (respuesta == "S" || respuesta == "s" || respuesta == "Si" || respuesta == "si") {
            println(pJugador)
        } else {
            pJugador = pJugador.crearPersonaje()
            println(pJugador)
        }

        println("¿El mercader quiere comerciar contigo que le ofreces?")
        println("Estos son tus objetos:\n ${pJugador.objetos}")
        println("Pon el valor de los objetos que quieres vender")
        println("Si no quieres vender nada pon 0")

        do{
            valor = readLine()!!.toInt()
            if(valor != 0){
                arrval.add(valor)
            }
            cont++

        }while (valor != 0 && cont <= pJugador.objetos.size)













        println("¿Quieres seguir jugando? (S/N)")
        respuesta = readLine().toString()


    }while (respuesta != "N" && respuesta != "n" && respuesta != "No" && respuesta != "no")
}