package com.example;
import com.microsoft.azure.functions.HttpStatus
import io.micronaut.azure.function.http.HttpRequestMessageBuilder
import io.micronaut.http.HttpMethod
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions

class HelloFunctionTest {

    @Test
    fun testFunctionGet() {
        Function().use { function ->
           val response = function.request(HttpMethod.GET, "/hello/get")
                                  .invoke()
           Assertions.assertEquals(HttpStatus.OK, response.status)
        }
    }
    @Test
    fun testFunctionPost() {
        Function().use { function ->
            val response = function.request(HttpMethod.POST, "/hello/post")
                    .body("some content")
                    .invoke()
            Assertions.assertEquals(HttpStatus.OK, response.status)
            Assertions.assertEquals("What goes in must go out: [some content]",response.bodyAsString)
        }
    }

}
