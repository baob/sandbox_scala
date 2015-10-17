def forLoop {
    println( "for loop using java style iteration" )
    for(i <- 0 until args.length) {
        println(args(i))
    }

}
forLoop

// vim: set ts=2 sw=2 et sts=2:
