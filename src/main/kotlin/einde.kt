fun eindroom() {

        var weapon1 = Weapons("club", 20)
        var enemy1 = Enemy("gans", 10, 65, 85)
        var maurice = Player("maurice", 10, 100, 105)

    fun eind() {

        print("eind")
    }

    fun boss() {
        fun vraag1() {


            println("Waar leven ijsberen op de ......")
            var raadsels = readLine()
            if (raadsels == "Noordpool") {
                println("je hebt 20 dmg gedaan")
                enemy2.takeDamage(weapon1.damage)
                boss()

            } else {
                println("je krijgt 25 dmg")
                maurice.takeDamage(25)
                vraag1()
            }
        }


        fun vraag2() {
            println("Waar leven de pinguin op de .........")
            var raadsels = readLine()
            if (raadsels == "Zuidpool") {
                println("je hebt 20 dmg gedaan")
                enemy2.takeDamage(weapon1.damage)
                boss()
            } else {
                println("je krijgt 25 dmg")
               maurice.takeDamage(25)
                vraag2()
            }
        }

        fun vraag3() {


            println("Vraag drie: wat is de latijnse benaming van ijsberen")
            var raadsels = readLine()
            if (raadsels == "Ursus Maritimus") {
                println("je hebt 20 dmg gedaan")
                enemy2.takeDamage(weapon1.damage)
                boss()

            } else {
                println("je krijgt 25 dmg")
                maurice.takeDamage(25)
                vraag3()
            }
        }

        fun vraag4() {

            println("Engels naam voor ijsbeer")

            var raadsels = readLine()
            if (raadsels == "Polarbear") {
                println("je hebt 20 dmg gedaan")
                enemy2.takeDamage(weapon1.damage)
                boss()

            } else {
                println("Engelsen naam voor zuidpool")
                maurice.takeDamage(25)
                vraag4()
            }
        }

        fun vraag5() {

            println("Engelse naam voor zuidpool")

            var raadsels = readLine()
            if (raadsels == "South pole") {
                println("je hebt 20 dmg gedaan")
                enemy2.takeDamage(weapon1.damage)
                boss()

            } else {
                println("je krijgt 25 dmg")
                maurice.takeDamage(25)
                vraag5()
            }
        }

        fun vraag6() {

            println("Kan een Pinguin vliegen")

            var raadsels = readLine()
            if (raadsels == "Nee") {
                println("je hebt 20 dmg gedaan")
                enemy2.takeDamage(weapon1.damage)
                boss()

            } else {
                println("je krijgt 25 dmg")
                maurice.takeDamage(25)
                vraag6()
            }
        }

        fun vraag7() {

            println("Kunnen struisvogels vliegen?")

            var raadsels = readLine()
            if (raadsels == "Nee") {
                println("je hebt 20 dmg gedaan")
                enemy2.takeDamage(4)
                boss()

            } else {
                println("je krijgt 25 dmg")
                maurice.takeDamage(25)
                vraag7()
            }
        }


        fun bossfight() {
            if (enemy2.hitpoints > 64) {
                vraag1()
            } else if (enemy2.hitpoints > 54) {
                vraag2()

            } else if (enemy2.hitpoints > 44) {
                vraag3()

            } else if (enemy2.hitpoints > 34) {
                vraag4()

            } else if (enemy2.hitpoints > 24) {
                vraag5()

            } else if (enemy2.hitpoints > 14) {
                vraag6()

            } else if (enemy2.hitpoints > 4) {
                vraag7()

            } else {
                eind()
            }
        }
       bossfight()
    }
    boss()
}