package com.example

import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.*
import io.micronaut.validation.Validated
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull

@Validated
@Controller("/hello")
class HelloController(
        val memoryBomb: MemoryBomb) {


    @Get(uri="/get", produces=["text/plain"])
    fun index(): String {
        return "Example Response"
    }

    @Get(uri="/memorybomb", produces=["text/plain"])
    fun memorybomb(): String {
        return "Example Response Memory-Bomb-Uuid:[${memoryBomb.uuid}] [${memoryBomb.memoryBombString.length}]"
    }

    @Post(uri="/post", produces=["text/plain"], consumes = ["text/plain"])
    fun inbound(@Body input: String): String {
        return "What goes in must go out: [$input]"
    }

}