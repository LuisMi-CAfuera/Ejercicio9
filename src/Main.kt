
fun main() {

    //Todo lo del jugador puede ser aleatorio o elegido por el usuario pero si lo elige el usuario los objetos y el monedero siempre van a ser aleatorios
    var pJugador = Personaje()
    var pJugador2 = Personaje()
    //Como el mercader siempre tiene que tener espacio suficiente y dinero suficiente para compra objetos
    var mercader = Personaje(
        "Mercader", 100, mutableMapOf(
            "1" to 100,
            "5" to 100,
            "10" to 100,
            "25" to 100,
            "100" to 100
        )
    )


    //Aqui te dejo elegir si quieres que el personaje sea aleatorio o lo crees tu
    do {


        println("¿Quieres que el personaje sea aleatorio? (S/N)")
        println("El tamaño de la mochila,los objetos y el dinero del personaje siempre seran aleatorios")
        var respuesta = readLine().toString()


        if (respuesta == "S" || respuesta == "s" || respuesta == "Si" || respuesta == "si") {
            println("Jugador 1:\n${pJugador}")
            println("Jugador 2:\n${pJugador2}")
        } else {
            pJugador = pJugador.crearPersonaje()
            println("Jugador 1:\n${pJugador}")
            pJugador2 = pJugador2.crearPersonaje()
            println("Jugador 2:\n${pJugador2}")
        }


        println("¿Que jugador quieres que intercambie?(Si quieres que sea el mercader por defecto pon mercader) ")
        println("Vendedor")
        respuesta = readLine().toString()
        println("Mercader")
        var respuesta2 = readLine().toString()

        if (respuesta == "Jugador1" && respuesta2 == "mercader") {
            pJugador = pJugador.intercambio(pJugador, mercader)
        } else {
            if (respuesta == "Jugador2" && respuesta2 == "mercader") {
                pJugador2 = pJugador2.intercambio(pJugador2, mercader)
            } else {
                if (respuesta == "Jugador1" && respuesta2 == "Jugador2") {
                    pJugador = pJugador.intercambio(pJugador, mercader)
                } else {
                    if (respuesta == "Jugador2" && respuesta2 == "Jugador1") {
                        pJugador2 = pJugador2.intercambio(pJugador2, mercader)
                    }else{
                        if (respuesta == "mercader" && respuesta2 == "Jugador1") {
                            pJugador = pJugador.intercambio(pJugador, mercader)
                        }else{
                            if (respuesta == "mercader" && respuesta2 == "Jugador2") {
                                pJugador2 = pJugador2.intercambio(pJugador2, mercader)
                            }
                        }
                    }
                }
            }
        }






        println("¿Quieres seguir jugando? (S/N)")
        respuesta = readLine().toString()


    } while (respuesta != "N" && respuesta != "n" && respuesta != "No" && respuesta != "no")
}




