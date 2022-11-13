
fun main() {


    do {
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
        println("¿Quieres que el personaje sea aleatorio? (S/N)")
        println("El tamaño de la mochila,los objetos y el dinero del personaje siempre seran aleatorios")
        var respuesta = readLine().toString()


        if (respuesta.equals("S", true)) {
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


        //Este if es para controlar que siempre haya uno de los dos que intercambien
        if ((respuesta == "Jugador1" && pJugador.clase== "Mercader") || (respuesta2 == "mercader" && mercader.clase == "Mercader")) {
            pJugador.intercambio(pJugador, mercader)
        } else {
            if ((respuesta == "Jugador2" && pJugador2.clase=="Mercader") || (respuesta2 == "mercader" && mercader.clase == "Mercader")) {
                pJugador2.intercambio(pJugador2, mercader)
            } else {
                if ((respuesta == "Jugador1" && pJugador.clase=="Mercader") || (respuesta2 == "Jugador2" && pJugador2.clase == "Mercader")) {
                    pJugador.intercambio(pJugador, pJugador2)
                } else {
                    if ((respuesta == "Jugador2" && pJugador2.clase=="Mercader") || (respuesta2 == "Jugador1" && pJugador.clase == "Mercader")) {
                        pJugador2.intercambio(pJugador2, pJugador)
                    } else {
                        if ((respuesta2 == "mercader" && mercader.clase == "Mercader") || (respuesta2 == "Jugador1" && pJugador.clase == "Mercader")) {
                            pJugador.intercambio(mercader, pJugador)
                        } else {
                            if ((respuesta2 == "mercader" && mercader.clase == "Mercader") || (respuesta2 == "Jugador2" && pJugador2.clase == "Mercader")) {
                                pJugador2.intercambio(mercader, pJugador2)
                            } else {
                                println("No se ha podido realizar el intercambio por que ninguno de los jugadores es el mercader")
                            }
                        }
                    }
                }
            }
        }






        println("¿Quieres seguir jugando? (S/N)")
        respuesta = readLine().toString()


    } while (!respuesta.equals("N", true))
}




