
fun main() {

    //Todo lo del jugador puede ser aleatorio o elegido por el usuario pero si lo elige el usuario los objetos y el monedero siempre van a ser aleatorios
    var pJugador = Personaje()
    //Como el mercader siempre tiene que tener espacio suficiente y dinero suficiente para compra objetos
    var mercader = Personaje("Mercader",  1000, arrayListOf(), mapOf(
        "1" to 10000,
        "5" to 10000,
        "10" to 10000,
        "25" to 10000,
        "100" to 10000))
    var arrval = arrayListOf<Int>()
    var cont = 0
    var valor = 0
    var obVender = arrayListOf<Objetos>()
    var precio = 0
    var cociente = 0

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


        println("¿El mercader quiere comerciar contigo que le ofreces?\n")



            println("Pon el valor de los objetos que quieres vender\n")
            println("Si no quieres vender nada mas o para acaba pon 0\n")
            println("Estos son tus objetos:\n${pJugador.objetos}\n")

            do {
                valor = readLine()!!.toInt()
                if (valor != 0) {
                    arrval.add(valor)
                }
                cont++

            } while (valor != 0 && cont < 5)

            //Aqui compruebo el valo metido por pantalla y si coincide con los objetos que tiene el jugador lo añado al array que le voy a dar al mercader
            for (i in arrval) {
                for (j in pJugador.objetos) {
                    if (i == j.valor) {
                        obVender.add(j)
                    }
                }
            }

        obVender.forEach(){
            precio += it.valor
        }

        println("Mercader :\n el valor de los objetos que me quieres vender es $precio\n")
        println("Te voy a dar estas monedas\n")


        //Todos estos if son para que le mercader reparte en diferentes monedas el precio
        cociente = precio / 100
        if (cociente > 0) {
            println("De 100 te voy a dar: $cociente\n")
            precio -= 100 * cociente
        }
        cociente = precio / 25
        if (cociente > 0) {
            println("De 25 te voy a dar: $cociente\n")
            precio -= 25 * cociente
        }
        cociente = precio / 10
        if (cociente > 0) {
            println("De 10 te voy a dar: $cociente\n")
            precio -= 10 * cociente
        }
        cociente = precio / 5
        if (cociente > 0) {
            println("De 5 te voy a dar: $cociente\n")
            precio -= 5 * cociente
        }
        cociente = precio / 1
        if (cociente > 0) {
            println("De 1 te voy a dar: $cociente\n")
            precio -= 1 * cociente
        }




        mercader.objetos.addAll(obVender)
        pJugador.objetos.removeAll(obVender)


        println("Objetos de mercader : ${mercader.objetos}\n")

        println("Objetos de Jugador : ${pJugador.objetos}\n")







        println("¿Quieres seguir jugando? (S/N)")
        respuesta = readLine().toString()


    }while (respuesta != "N" && respuesta != "n" && respuesta != "No" && respuesta != "no")
}