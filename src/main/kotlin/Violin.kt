class Violin : Instrumento() {



    //tabla que almacena las notas a interpretar
   override  var melodia = mutableListOf<Nota>()

   override fun incorporaNota(nota: Nota) {
        melodia.add(nota)
    }

   override fun reset() = melodia.clear()

    //Recorreremos las notas y las interpretaremos de la forma específica del piano.
   override fun play() {
        println("Tocando violin")
        melodia.forEach { nota ->
            when (nota) {
                Nota.DO -> print("doooggg ")
                Nota.RE -> print("reeeggg ")
                Nota.MI -> print("miiiiggg ")
                Nota.FA -> print("faaaggg ")
                Nota.SOL -> print("sooolggg ")
                Nota.LA -> print("laaaggg ")
                Nota.SI -> print("siiiiggg ")
            }
        }
        println("")
    }

}

