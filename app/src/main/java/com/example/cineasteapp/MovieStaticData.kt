package com.example.cineasteapp


fun getFavoriteMovies(): List<Movie> {
    return listOf(
        Movie(1,"Johnny English Strikes Again",
            "After a cyber-attack reveals the identity of all of the active undercover agents in Britain, Johnny English is forced to come out of retirement to find the mastermind hacker.",
            "05.10.2018.","https://www.imdb.com/title/tt6921996/",
            "comedy"),
        Movie(2,"The Fast and the Furious",
            "Los Angeles police officer Brian O'Conner must decide where his loyalty really lies when he becomes enamored with the street racing world he has been sent undercover to destroy.",
            "22.06.2001.","https://www.imdb.com/title/tt0232500/",
            "thriller"),
        Movie(3,"Mad Max: Fury Road",
            "In a post-apocalyptic wasteland, a woman rebels against a tyrannical ruler in search for her homeland with the aid of a group of female prisoners, a psychotic worshiper and a drifter named Max.",
            "13.05.2015.","https://www.imdb.com/title/tt1392190/",
            "madmax"),
        Movie(4,"Top Gun: Maverick",
            "After thirty years, Maverick is still pushing the envelope as a top naval aviator, but must confront ghosts of his past when he leads TOP GUN's elite graduates on a mission that demands the ultimate sacrifice from those chosen to fly it.",
            "27.05.2022.","https://www.imdb.com/title/tt1745960/",
            "drama"),
        //Dodajte filmove po zelji
    )
}
fun getRecentMovies(): List<Movie> {
    return listOf(
        Movie(1,"Furiosa: A Mad Max Saga",
            "The origin story of renegade warrior Furiosa before her encounter and teamup with Mad Max.",
            "24.05.2024.","https://www.imdb.com/title/tt12037194/",
            "action"),
        Movie(2,"Creed III",
            "Adonis has been thriving in both his career and family life, but when a childhood friend and former boxing prodigy resurfaces, the face-off is more than just a fight.",
            "26.03.2019.","https://www.imdb.com/title/tt11145118/",
            "mystery"),
        Movie(3,"Armageddon",
            "After discovering that an asteroid the size of Texas will impact Earth in less than a month, NASA recruits a misfit team of deep-core drillers to save the planet.",
            "01.08.1998.","https://www.imdb.com/title/tt0120591/",
            "scifi"),
        Movie(4,"Interstellar",
            "When Earth becomes uninhabitable in the future, a farmer and ex-NASA pilot, Joseph Cooper, is tasked to pilot a spacecraft, along with a team of researchers, to find a new planet for humans.",
            "05.11.2014.","https://www.imdb.com/title/tt0816692/",
            "interstellar"),

        //Dodajte filmove po zelji
    )
}

fun getMovieActors():Map<String,List<String>>{
    return mapOf<String,List<String>>("Johnny English Strikes Again" to listOf("Rowan Atkinson","Ben Miller","Emma Thompson"),"The Fast and the Furious" to listOf("Vin Diesel","Paul Walker","Michelle Rodriguez"),"Mad Max: Fury Road" to listOf("Tom Hardy","Charlize Theron","Nicholas Hoult"),"Top Gun: Maverick" to listOf("Tom Cruise","Miles Teller","Val Kilmer"),"Furiosa: A Mad Max Saga" to listOf("Chris Hemsworth","Quaden Bayles","Anya Taylor-Joy"),"Creed III" to listOf("Jonathan Majors","Michael B. Jordan","Tessa Thompson"),"Armageddon" to listOf("Bruce Willis","Liv Tyler","Ben Affleck"),"Interstellar" to listOf("Matthew McConaughey ","Mat Damon","Anne Hathaway"))
}

fun getSimilarMovies():Map<String,List<String>>{
    return mapOf<String,List<String>>("Johnny English Strikes Again" to listOf("Spy","Get Smart","The Brothers Grimsby"),"The Fast and the Furious" to listOf("Fast Five","Fourious 7","Need for Speed"),"Mad Max: Fury Road" to listOf("The Road Warrior","Dredd","The Book of Eli"),"Top Gun: Maverick" to listOf("Behind Enemy Lines","Midway","Sky Fighters"),"Furiosa: A Mad Max Saga" to listOf("Edge of Tommorrow","Morbius","Rebel Moon"),"Creed III" to listOf("Million Dollar Baby","Southpaw","Warrior"),"Armageddon" to listOf("Deep Impact","The Day After Tomorrow"," Independence Day"),"Interstellar" to listOf("A Space Odyssey","Oblivion","Moon"))
}