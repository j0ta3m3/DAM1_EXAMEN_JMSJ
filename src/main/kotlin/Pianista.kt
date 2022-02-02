
class Pianista(unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0)):Musico(unaCancion) {

    var instrumento = Instrumento()
    var partitura: Array<Nota?> = unaCancion
        set(value) {
            field = value
            instrumento.reset()
            value.forEach { nota ->
                i("Pianista.setPartitura","incorpora nota $nota de canción")
                nota?.let { instrumento.incorporaNota(nota) }
            }
        }

    init {
        partitura = unaCancion
    }

   open fun interpretar() = instrumento.play()
}