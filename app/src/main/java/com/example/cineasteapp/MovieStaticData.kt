package com.example.cineasteapp


fun getFavoriteMovies(): List<Movie> {
    return listOf(
        Movie(1,"Johnny English Strikes Again",
            "After a cyber-attack reveals the identity of all of the active undercover agents in Britain, Johnny English is forced to come out of retirement to find the mastermind hacker.",
            "05.10.2018.","https://www.imdb.com/title/tt6921996/",
            "comedy","https://www.imdb.com/title/tt6921996/?ref_=fn_al_tt_1","https://www.imdb.com/title/tt6921996/?ref_=fn_al_tt_1"),
        Movie(2,"The Fast and the Furious",
            "Los Angeles police officer Brian O'Conner must decide where his loyalty really lies when he becomes enamored with the street racing world he has been sent undercover to destroy.",
            "22.06.2001.","https://www.imdb.com/title/tt0232500/",
            "thriller","https://www.imdb.com/title/tt0232500/","https://www.imdb.com/title/tt0232500/"),
        Movie(3,"Mad Max: Fury Road",
            "In a post-apocalyptic wasteland, a woman rebels against a tyrannical ruler in search for her homeland with the aid of a group of female prisoners, a psychotic worshiper and a drifter named Max.",
            "13.05.2015.","https://www.imdb.com/title/tt1392190/",
            "madmax","https://www.imdb.com/title/tt1392190/","https://www.imdb.com/title/tt1392190/"),
        Movie(4,"Top Gun: Maverick",
            "After thirty years, Maverick is still pushing the envelope as a top naval aviator, but must confront ghosts of his past when he leads TOP GUN's elite graduates on a mission that demands the ultimate sacrifice from those chosen to fly it.",
            "27.05.2022.","https://www.imdb.com/title/tt1745960/",
            "drama","https://www.imdb.com/title/tt1745960/","https://www.imdb.com/title/tt1745960/"),
        Movie(5,"Shaun of the Dead",
            "A man's uneventful life is disrupted by the zombie apocalypse.",
            "09.04.2004","https://www.imdb.com/title/tt0365748/",
            "comedy","https://www.imdb.com/title/tt0414387/","https://www.imdb.com/title/tt0414387/"),
        Movie(6,"Watchmen",
            "In 1985 where former superheroes exist, the murder of a colleague sends active vigilante Rorschach into his own sprawling investigation, uncovering something that could completely change the course of history as we know it.",
            "23.02.2009.","https://www.imdb.com/title/tt0409459/",
            "action","https://www.imdb.com/title/tt0414387/","https://www.imdb.com/title/tt0414387/")
    )
}
fun getRecentMovies(): List<Movie> {
    return listOf(
        Movie(1,"Furiosa: A Mad Max Saga",
            "The origin story of renegade warrior Furiosa before her encounter and teamup with Mad Max.",
            "24.05.2024.","https://www.imdb.com/title/tt12037194",
            "action","https://www.imdb.com/title/tt12037194","https://www.imdb.com/title/tt12037194"),

        Movie(2,"Creed III",
            "Adonis has been thriving in both his career and family life, but when a childhood friend and former boxing prodigy resurfaces, the face-off is more than just a fight.",
            "26.03.2019.","https://www.imdb.com/title/tt11145118/",
            "mystery","https://www.imdb.com/title/tt11145118/","https://www.imdb.com/title/tt11145118/"),
        Movie(3,"Armageddon",
            "After discovering that an asteroid the size of Texas will impact Earth in less than a month, NASA recruits a misfit team of deep-core drillers to save the planet.",
            "01.08.1998.","https://www.imdb.com/title/tt0120591/",
            "scifi","https://www.imdb.com/title/tt11145118/","https://www.imdb.com/title/tt11145118/"),
        Movie(4,"Interstellar",
            "When Earth becomes uninhabitable in the future, a farmer and ex-NASA pilot, Joseph Cooper, is tasked to pilot a spacecraft, along with a team of researchers, to find a new planet for humans.",
            "05.11.2014.","https://www.imdb.com/title/tt0816692/",
            "interstellar","https://www.imdb.com/title/tt11145118/","https://www.imdb.com/title/tt11145118/"),
        Movie(5,"A Quiet Place: Day One",
            "Experience the day the world went quiet.",
            "28.07.2024.","https://www.imdb.com/title/tt13433802",
            "horror","https://www.imdb.com/title/tt12037194","https://www.imdb.com/title/tt12037194"),


    )
}
fun getMovieActors():Map<String,List<String>>{
    return mapOf<String,List<String>>("Pulp Fiction" to listOf("John Travolta","Samuel L. Jackson","Bruce Willis","Amanda Plummer","Laura Lovelace"),"Pride and prejudice" to listOf("Keira Knightley","Talulah Riley","Rosamund Pike"))
}

fun getSimilarMovies():Map<String,List<String>>{
    return mapOf<String,List<String>>("Pulp Fiction" to listOf("Fight Club","Inception","Se7en"),"Pride and prejudice" to listOf("Jane Eyre","The Notebook","Atonement"))
}