
fun main() {

    //Todo lo del jugador puede ser aleatorio o elegido por el usuario pero si lo elige el usuario los objetos y el monedero siempre van a ser aleatorios
    var pJugador = Personaje()
    var pJugador2 = Personaje()
    //Como el mercader siempre tiene que tener espacio suficiente y dinero suficiente para compra objetos
    var mercader = Personaje("Mercader",  100, arrayListOf(), mutableMapOf(
        "1" to 100,
        "5" to 100,
        "10" to 100,
        "25" to 100,
        "100" to 100)
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


        println("¿Con que Jugador quieres jugar? (1/2)")
        respuesta = readLine().toString()

        if (respuesta == "1"){
            pJugador=pJugador.intercambio(pJugador,mercader)
        }else{
            pJugador2=pJugador2.intercambio(pJugador2,mercader)
        }






        println("¿Quieres seguir jugando? (S/N)")
        respuesta = readLine().toString()


    }while (respuesta != "N" && respuesta != "n" && respuesta != "No" && respuesta != "no")
}



