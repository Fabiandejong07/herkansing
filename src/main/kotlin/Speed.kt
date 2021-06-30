class Speed(val name: String, var speed: Int) {

    open fun takespeed(takespeed: Int) {
        val remainingSpeed = speed - takespeed
        if (remainingSpeed > 0) {
            speed = remainingSpeed
            println( "$name took $takespeed points of damage and has $speed left")

        }else{

            println("$name lost speed.")
        }
    }
}