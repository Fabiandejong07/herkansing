fun cave(){
    println(" je gaat langs een meertje staat nu in de cave " +
            "er zijn wat tunnels " )



    fun boss(){

        println("bossfight")
    }

    fun keuzekant(){
        println("[noord] [oost] [zuid] [west]")
        var keuze = readLine()

        if (keuze == "noord") {
            println("je loopt noord naar het meertje")
            println("er is  geen eten te vinden dus je gaat terug")
            keuzekant()
        } else if (keuze == "oost") {
            println("je loopt naar oost je ziet een mensen stad da vind je eng dus je gaat terug")
            keuzekant()
        }
        else if (keuze == "zuid"){
            println("ja gaat naar zuid")
            println("je komt uit bij een sneeuw bos ")
            println("sneeuw is geen eten dus je gaat weer terug")
            keuzekant()
        }
        else if (keuze == "west"){
            println("Je gaat naar west je ziet een tros bananen maar " +
                    "er staat een beer voor")
            boss()
        }
    }



    keuzekant()
}