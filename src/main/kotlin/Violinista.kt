class Violinista(unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0)):Musico(unaCancion) {

    var violin = Violin()
    var partitura: Array<Nota?> = unaCancion
        set(value) {
            field = value
            violin.reset()
            value.forEach { nota ->
                i("Violinista.setPartitura","incorpora nota $nota de canción")
                nota?.let { violin.incorporaNota(nota) }
            }
        }

    init {
        partitura = unaCancion
    }

    fun interpretar() = violin.play()
}