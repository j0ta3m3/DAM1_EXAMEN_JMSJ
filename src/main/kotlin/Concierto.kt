
fun main() {
    var violin = Piano()
    var piano1 = Piano()
    val pianista = Violinista()
    val cancion = arrayOf<Nota?>(Nota.DO, Nota.FA, Nota.FA, Nota.MI)
    pianista.partitura = cancion
    pianista.violin
    pianista.interpretar()
}
