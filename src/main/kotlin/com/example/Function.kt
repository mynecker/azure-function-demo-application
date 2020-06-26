package com.example
import com.microsoft.azure.functions.*
import com.microsoft.azure.functions.annotation.*
import io.micronaut.azure.function.http.AzureHttpFunction
import java.util.*

class Function : AzureHttpFunction() {

    var functionUuid = UUID.randomUUID()

    @FunctionName("ExampleTrigger")
    fun invoke(
            @HttpTrigger(name = "req",
                    methods = [HttpMethod.GET, HttpMethod.POST],
                    route = "{*route}",
                    authLevel = AuthorizationLevel.ANONYMOUS)
            request: HttpRequestMessage<Optional<String>>,
            context: ExecutionContext): HttpResponseMessage {
            context.logger.info("Function-UUID:${functionUuid}")
        return super.route(request, context)
    }
}