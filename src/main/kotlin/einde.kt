fun eindroom() {
    fun eindeboss() {

        var enemy2 = Enemy("gans", 10, 100, 100)
        var maurice = Player("maurice", 10, 100, 105)

        fun eind() {

        }






        fun bossgevecht() {
            if (enemy2.speed < maurice.speed) {
                enemy2.takeDamage(4)

            }
        }

        fun bossfight() {
            if (enemy2.hitpoints > 64) {
                bossgevecht()
            } else if (enemy2.hitpoints > 54) {
                bossgevecht()

            } else if (enemy2.hitpoints > 44) {

                bossgevecht()
            } else if (enemy2.hitpoints > 34) {

                bossgevecht()

            } else {
                eind()
            }
        }
        bossfight()



    }
    eindeboss()
}