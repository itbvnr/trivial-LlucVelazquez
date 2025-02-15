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
        "¿Qué planeta del sistema solar es conocido como el planeta rojo?",
        listOf(
            Respuesta("Venus", false),
            Respuesta("Marte", true),
            Respuesta("Júpiter", false),
            Respuesta("Saturno", false)
        )
    ),
    Pregunta(
        "¿Cuál es la capital de España?",
        listOf(
            Respuesta("Barcelona", false),
            Respuesta("Jaen", false),
            Respuesta("Sant Pere de Vilamajor", false),
            Respuesta("Madrid", true)
        )
    ),
    Pregunta(
        "¿Cuál es el hueso más largo del cuerpo humano?",
        listOf(
            Respuesta("Fémur", true),
            Respuesta("Tibia", false),
            Respuesta("Peroné", false),
            Respuesta("Húmero", false)
        )
    ),
    Pregunta(
        "¿Quién pintó La noche estrellada?",
        listOf(
            Respuesta("Claude Monet", false),
            Respuesta("Vincent van Gogh", true),
            Respuesta("Leonardo da Vinci", false),
            Respuesta("Pablo Picasso", false)
        )
    ),
    Pregunta(
        "¿En qué año cayó el Muro de Berlín?",
        listOf(
            Respuesta("1985", false),
            Respuesta("1989", true),
            Respuesta("1991", false),
            Respuesta("1995", false)
        )
    ),
    Pregunta(
        "¿Cuál es el símbolo químico del oro?",
        listOf(
            Respuesta("Ag", false),
            Respuesta("Fe", false),
            Respuesta("Au", true),
            Respuesta("Pb", false)
        )
    ),
    Pregunta(
        "¿Quién es el autor de la novela Don Quijote de la Mancha?",
        listOf(
            Respuesta("Miguel de Unamuno", false),
            Respuesta("Federico García Lorca", false),
            Respuesta("Miguel de Cervantes", true),
            Respuesta("Lope de Vega", false)
        )
    ),
)
fun obtenerPreguntaAleatoria(): Pregunta {
    return preguntas.random()
}
fun mezclarRespuestas(pregunta: Pregunta): Pregunta {
    return pregunta.copy(respuestas = pregunta.respuestas.shuffled())
}

