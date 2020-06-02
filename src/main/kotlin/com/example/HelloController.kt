package com.example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Post

@Controller("/hello")
class HelloController {

    @Get(uri="/get", produces=["text/plain"])
    fun index(): String {
        return "Example Response"
    }

    @Post(uri="/post", produces=["text/plain"], consumes = ["text/plain"])
    fun inbound(@Body input: String): String {
        return "What goes in must go out: [$input]"
    }

}