fun bos(){
    println("je gaat de bos in")

    fun boss(){

        println("bossfight")
    }

    fun keuzekant() {
        println("[noord] [oost] [zuid] [west]")
        var keuze = readLine()

        if (keuze == "noord") {
            println("je loopt noord naar het meertje")
            println("bij het meer is geen eten dus je gaat maar weer terug")
            keuzekant()
        } else if (keuze == "oost") {
            println("je loopt naar oost ")
            println("je komt bij de rand van het bos er is geen lekker eten te vinden")
            println("dus je gaat terug")
            keuzekant()
        } else if (keuze == "zuid") {
            println("ja gaat naar zuid")
            println("je ziet een tros bananen je word heel blij je rent er naartoe")
            println("oei een vos pakt het net voor je weg je gaat vechten met de vos")
            boss()
        } else if (keuze == "west") {
            println("je loopt naar west ")
            println("je komt bij een auto weg waar geen eten is" +
                    " en het is ook eng natuurlijk al die stalen monsters")
            println("dus je gaat weer terug")
            keuzekant()
        }
    }
    keuzekant()
}