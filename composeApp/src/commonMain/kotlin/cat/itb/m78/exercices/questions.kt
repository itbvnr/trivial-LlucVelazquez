package cat.itb.m78.exercices


data class Respuesta(val texto: String, val esCorrecta: Boolean)

data class Pregunta(
    val texto: String,
    val respuestas: List<Respuesta>
)
val preguntas = listOf(
    Pregunta(
        "¿Cuál es la capital de Francia?",
        listOf(
            Respuesta("Londres", false),
            Respuesta("Berlín", false),
            Respuesta("París", true),
            Respuesta("Madrid", false)
        )
    ),
    Pregunta(
        "¿En qué año comenzó la Segunda Guerra Mundial?",
        listOf(
            Respuesta("1939", true),
            Respuesta("1945", false),
            Respuesta("1914", false),
            Respuesta("1941", false)
        )
    ),
    // Añade más preguntas aquí...
)
fun obtenerPreguntaAleatoria(): Pregunta {
    return preguntas.random()
}
fun mezclarRespuestas(pregunta: Pregunta): Pregunta {
    return pregunta.copy(respuestas = pregunta.respuestas.shuffled())
}
/*fun resupestasMezcladas(respuesta: Pregunta): Respuesta {
    mezclarRespuestas(obtenerPreguntaAleatoria()).respuestas.forEachIndexed { index, respuesta ->
        ("${index + 1}. ${respuesta.texto}")
    }
*/
