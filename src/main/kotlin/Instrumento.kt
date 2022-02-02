interface Interprete{
    fun play(){}
    fun incorporaNota(nota: Nota) {}

    fun reset() {}
}

open class Instrumento {

    /**
     * Tabla que almacena las notas a interpretar
     * @param mutableList
     * @property melodia
     */
    open var melodia = mutableListOf<Nota>()


    /**
     * Recorreremos las notas y las interpretaremos de la forma específica del piano.
     * @param melodia
     *
     */
   open fun play() {

    }

    /**
     * Recibimos las notas y se la añadimos a la melodia
     * @param nota:Nota
     * @return melodia
     */
    open fun incorporaNota(nota: Nota) {

    }

    /**
     * Borra las notas de una melodia y la deja vacía
     * @param recibe una melodia
     * @return devuelve esa melodia vacía
     */
        open fun reset() {
    }


   open  fun incorporaCancion(array:Array<Nota?>){


    }
    //Recorreremos las notas y las interpretaremos de la forma específica del piano.



}