class Personaje {
    var nombre = Nombre()
    var raza = Raza()
    var estado = Edad()
    var clase = Clase()
    var mochila = Mochila()
    var objetos = Objetos()
    var monedero : Map<String,Int> = mapOf(
        "1" to 0,
        "5" to 0,
        "10" to 0,
        "25" to 0,
        "100" to 0
    )

    constructor(nombre: String, clase: String, estado: String, raza: String,mochila : Int) {
        this.nombre = nombre
        this.clase = clase
        this.estado = estado
        this.raza = raza
        this.mochila = mochila
    }

    constructor()

    //Funcion que me diga que raza es aleatoriamente
    fun Raza(): String {
        var raza: String = " "
        var razas = arrayOf("Elfo", "Humano", "Enano", "Goblin")

        raza = razas.random()

        return raza
    }

    //Funcion que me diga si es adolescente,adulto o anciano aleatoriamente
    fun Edad(): String {
        var edad: String = " "
        var edades = arrayOf("Adolescente", "Adulto", "Anciano")

        edad = edades.random()

        return edad
    }

    //Funcion que me de un nombre del EldenRing(Por que me apetece) aleatorio de un array de 7  nombres
    fun Nombre(): String {
        var nombre: String = " "
        var nombres = arrayOf("Gwyn", "Gwyndolin", "Gwynevere", "Malenia", "Melina", "Ranni", "Radagon")

        nombre = nombres.random()

        return nombre
    }

    //Funcion que me diga el tipo de clase
    fun Clase(): String {
        var clase: String = " "
        var clases = arrayOf("Guerrero", "Mago", "Ladron", "Berserk","Mercader")

        clase = clases.random()

        return clase
    }

    //Funcion que me de el tamaño de la mochila del 1 al 6 y luego el resultado se multiplica por 10 para que sea el peso
    fun Mochila(): Int {
        var mochila: Int = 0
        var tam = arrayOf(1, 2, 3, 4, 5, 6)

        mochila = tam.random()

        return mochila * 10
    }
    //Funcion que me devuelva un arraylist de 5 objetos de valor del 1 al 50 y que el peso de todos los objetos no supere el peso de la mochila
    fun Objetos(): ArrayList<Objetos> {
        var objetos = ArrayList<Objetos>()
        var peso = (1..10).random()
        var valor = (1..50).random()
        var contP = 0
        contP += peso
        var i = 1
        while (mochila >= contP  && i < 5) {
            peso = (1..10).random()
            valor = (1..50).random()
            objetos.add(Objetos(peso, valor))
            contP += peso
            i++
        }
        return objetos
    }

    override fun toString(): String {
        return "Personaje(nombre='$nombre', raza='$raza', estado='$estado', clase='$clase', mochila=$mochila, objetos=$objetos, monedero=$monedero)"
    }


}