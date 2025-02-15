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
    Pregunta(
        "¿Cuál es la capital de Australia?",
        listOf(
            Respuesta("Sídney", false),
            Respuesta("Melbourne", false),
            Respuesta("Canberra", true),
            Respuesta("Perth", false)
        )
    ),
    Pregunta(
        "¿Qué gas es el más abundante en la atmósfera terrestre?",
        listOf(
            Respuesta("Oxígeno", false),
            Respuesta("Dióxido de carbono", false),
            Respuesta("Nitrógeno", true),
            Respuesta("Argón", false)
        )
    ),
    Pregunta(
        "¿Quién escribió la obra Cien años de soledad?",
        listOf(
            Respuesta("Mario Vargas Llosa", false),
            Respuesta("Gabriel García Márquez", true),
            Respuesta("Julio Cortázar", false),
            Respuesta("Jorge Luis Borges", false)
        )
    ),
    Pregunta(
        "¿Cuál es el río más largo del mundo?",
        listOf(
            Respuesta("Amazonas", true),
            Respuesta("Nilo", false),
            Respuesta("Yangtsé", false),
            Respuesta("Misisipi", false)
        )
    ),
    Pregunta(
        "¿Qué planeta del sistema solar es conocido como el "planeta rojo"?",
        listOf(
            Respuesta("Venus", false),
            Respuesta("Marte", true),
            Respuesta("Júpiter", false),
            Respuesta("Saturno", false)
        )
    ),
)
fun obtenerPreguntaAleatoria(): Pregunta {
    return preguntas.random()
}
fun mezclarRespuestas(pregunta: Pregunta): Pregunta {
    return pregunta.copy(respuestas = pregunta.respuestas.shuffled())
}

