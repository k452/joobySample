package app

import io.jooby.Kooby
import io.jooby.runApp

class App : Kooby({

    get("/") {
        "Welcome to Jooby in Docker!!"
    }

    get("/hello/{name}") {
        "Hello :" + ctx.path("id").value()
    }


    post("/") {
        "Welcome to Post!"
    }

    post("/hello") {
        "Hello POST!"
    }

    post("/hello/man") {
        "Hello man!"
    }

})

fun main(args: Array<String>) {
    runApp(args, App::class)
}
