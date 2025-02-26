package cat.itb.m78.exercices


data class Respuesta(val texto: String, val esCorrecta: Boolean)



data class Pregunta(
    val texto: String,
    val respuestas: List<Respuesta>
)

val preguntas = listOf(
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
    Pregunta(
        "¿En qué año comenzó la Primera Guerra Mundial?",
        listOf(
            Respuesta("1912", false),
            Respuesta("1914", true),
            Respuesta("1916", false),
            Respuesta("1918", false)
        )
    ),
    Pregunta(
        "¿En qué país se encuentra el Taj Mahal?",
        listOf(
            Respuesta("Egipto", false),
            Respuesta("India", true),
            Respuesta("Marruecos", false),
            Respuesta("Turquía", false)
        )
    ),
    Pregunta(
        "¿Cuál es el planeta más grande del sistema solar?",
        listOf(
            Respuesta("Saturno", false),
            Respuesta("Júpiter", true),
            Respuesta("Neptuno", false),
            Respuesta("España", false)
        )
    ),
    Pregunta(
        "¿En qué año se fundó la ONU?",
        listOf(
            Respuesta("1945", true),
            Respuesta("1950", false),
            Respuesta("1955", false),
            Respuesta("1960", false)
        )
    ),
    Pregunta(
        "¿Quién fue el primer presidente de Estados Unidos?",
        listOf(
            Respuesta("Thomas Jefferson", false),
            Respuesta("Benjamin Franklin", false),
            Respuesta("George Washington", true),
            Respuesta("John Adams", false)
        )
    ),
    Pregunta(
        "¿Cuál es el metal más caro del mundo?",
        listOf(
            Respuesta("Oro", false),
            Respuesta("Platino", false),
            Respuesta("Rodio", true),
            Respuesta("Paladio", false)
        )
    ),
    Pregunta(
        "¿Quién escribió Romeo y Julieta?",
        listOf(
            Respuesta("Charles Dickens", false),
            Respuesta("William Shakespeare", true),
            Respuesta("Jane Austen", false),
            Respuesta("Mark Twain", false)
        )
    ),
)
val preguntasN = listOf(
    Pregunta(
        "¿Cuál es la capital de Inglaterra?",
        listOf(
            Respuesta("Chelsea", false),
            Respuesta("Londres", true),
            Respuesta("Manchester", false),
            Respuesta("Everton", false)
        )
    ),
    Pregunta(
        "¿Cuál es la capital de Italia?",
        listOf(
            Respuesta("Milan", false),
            Respuesta("Roma", true),
            Respuesta("Como", false),
            Respuesta("Turin", false)
        )
    ),
    Pregunta(
        "¿Cuál es la capital de Alemania?",
        listOf(
            Respuesta("Viena", false),
            Respuesta("Berlín", true),
            Respuesta("Leipzig", false),
            Respuesta("Munich", false)
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
        "¿Qué planeta del sistema solar es conocido como el planeta rojo?",
        listOf(
            Respuesta("Venus", false),
            Respuesta("Marte", true),
            Respuesta("Júpiter", false),
            Respuesta("Saturno", false)
        )
    ),
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
        "¿Cuál es el océano más grande del mundo?",
        listOf(
            Respuesta("Atlántico", false),
            Respuesta("Índico", false),
            Respuesta("Ártico", false),
            Respuesta("Pacífico", true)
        )
    ),
)
val preguntasE = listOf(
    Pregunta(
        "En que equipo juega Marc Casado?",
        listOf(
            Respuesta("Real Madrid", false),
            Respuesta("FC Barcelona", true),
            Respuesta("Sevilla FC", false),
            Respuesta("FC Vilamajor", false),
        )
    ),
    Pregunta(
        "En que equipo juega Lionel Andres Messi?",
        listOf(
            Respuesta("Paris Saint-Germain", false),
            Respuesta("FC Barcelona", false),
            Respuesta("Malmö FF", false),
            Respuesta("Inter Miami", true),
        )
    ),
    Pregunta(
        "En que equipo juega Luciano Dario Vietto?",
        listOf(
            Respuesta("Atletico de Madrid", false),
            Respuesta("Al Hilal", false),
            Respuesta("Racing Club", true),
            Respuesta("Racing de Santander", false),
        )
    ),
    Pregunta(
        "En que pais juega el equipo La Fiorita?",
        listOf(
            Respuesta("San Marino", false),
            Respuesta("Italia", false),
            Respuesta("Andorra", true),
            Respuesta("Brasil", false),
        )
    ),
    Pregunta(
        "En que equipo juega Luca Orellano?",
        listOf(
            Respuesta("FC Cincinnati", true),
            Respuesta("Vasco da Gama", false),
            Respuesta("Velez de Sarfield", false),
            Respuesta("Boca Juniors", false),
        )
    ),
    Pregunta(
        "En que equipo juega Charles de Ketelaere?",
        listOf(
            Respuesta("Atalanta FC", true),
            Respuesta("AC Milan", false),
            Respuesta("Club Brujas", false),
            Respuesta("AC Monza", false),
        )
    ),
    Pregunta(
        "Que equipo tiene el apodo de los Nerazzurri?",
        listOf(
            Respuesta("Atalanta FC", true),
            Respuesta("AC Milan", false),
            Respuesta("Como 1907", false),
            Respuesta("AC Monza", false),
        )
    ),
    Pregunta(
        "En que division estuvo en la 2020/21 el CE Sabadell?",
        listOf(
            Respuesta("Primera Division", false),
            Respuesta("La Liga EA Sports", false),
            Respuesta("Segunda Division", true),
            Respuesta("Primera Federacion", false),
        )
    ),
    Pregunta(
        "En que posicion acabo el CE Sabadell en la 2020/21?",
        listOf(
            Respuesta("23º", false),
            Respuesta("19º", true),
            Respuesta("18º", false),
            Respuesta("20º", false),
        )
    ),
    Pregunta(
        "En que año se fundo el FC Barcelona?",
        listOf(
            Respuesta("1898", false),
            Respuesta("1899", true),
            Respuesta("Ayer", false),
            Respuesta("1900", false),
        )
    ),
    Pregunta(
        "En que estadio jugo el FC Barcelona en la temporada 2024/25?",
        listOf(
            Respuesta("Estadio Olímpico Lluís Companys", true),
            Respuesta("Camp Nou", false),
            Respuesta("Spotify Camp Nou", false),
            Respuesta("Nova Creu ALta", false),
        )
    ),
    Pregunta(
        "En que estadio juega el CE Sabadell?",
        listOf(
            Respuesta("El Casa Taradellas", true),
            Respuesta("Estadio Montilivi", false),
            Respuesta("Spotify Camp Nou", false),
            Respuesta("Nova Creu ALta", true),
        )
    ),
    Pregunta(
        "En que año se fundo el CE Sabadell?",
        listOf(
            Respuesta("2000 A.C", false),
            Respuesta("1903", true),
            Respuesta("2027", false),
            Respuesta("1907", false),
        )
    ),
    Pregunta(
        "En que equipo juega Ricard Puig?",
        listOf(
            Respuesta("Inter Miami", false),
            Respuesta("LA Galaxy", true),
            Respuesta("FC Barcelona", false),
            Respuesta("New York City FC", false),
        )
    ),
    Pregunta(
        "Cual es el jugador más joven en firmar por un equipo de la Major League Soccer?",
        listOf(
            Respuesta("Maximo Carrizo", true),
            Respuesta("Axel Key", false),
            Respuesta("Axel Kei", false),
            Respuesta("Andres Iniesta", false),
        )
    ),
    Pregunta(
        "Quien marco el gol de la victoria en la final del mundo en el año 2010?",
        listOf(
            Respuesta("Andres Iniesta", true),
            Respuesta("David Villa", false),
            Respuesta("Lionel Messi", false),
            Respuesta("Arjen Robben", false),
        )
    ),
)

fun obtenerPreguntaAleatoria(): Pregunta {
    if (dificultad == "Easy" || dificultad == "Normal") {
        return preguntasN.random()
    }
    if (dificultad == "Hard" || dificultad == "Insane") {
        return preguntas.random()
    }
    if (dificultad == "Extreme") {
        return preguntasE.random()
    }
    else {
        return preguntas.random()
    }
}
fun mezclarRespuestas(pregunta: Pregunta): Pregunta {
    return pregunta.copy(respuestas = pregunta.respuestas.shuffled())
}
