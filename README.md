# Sample 

Related to: https://github.com/micronaut-projects/micronaut-azure/issues/5


Sample demonstrating issue with HTTP Azure Function POST request.

Based on Micronaut launch configuration 2.0.0.BUILD-SNAPSHOT 

## How to reproduce

- Deploy to Azure as Function
- Invoke HTTP POST to get the exception

### Azure Exception

Exception copied from Azure Function Monitoring
```java
Result: Failure Exception: ClassCastException: 
Cannot convert com.microsoft.azure.functions.worker.binding.RpcHttpRequestDataSource@49e9c63a
to type com.microsoft.azure.functions.HttpRequestMessage<java.util.Optional<byte[]>> 
Stack: java.lang.ClassCastException: Cannot convert com.microsoft.azure.functions.worker.binding.RpcHttpRequestDataSource@49e9c63a
to type com.microsoft.azure.functions.HttpRequestMessage<java.util.Optional<byte[]>> 
at com.microsoft.azure.functions.worker.binding.DataOperations.generalAssignment(DataOperations.java:191) 
at com.microsoft.azure.functions.worker.binding.DataOperations.apply(DataOperations.java:120) 
at com.microsoft.azure.functions.worker.binding.DataSource.computeByType(DataSource.java:56) 
at com.microsoft.azure.functions.worker.binding.RpcHttpRequestDataSource.computeByType(RpcHttpRequestDataSource.java:20) 
at com.microsoft.azure.functions.worker.binding.DataSource.computeByName(DataSource.java:42) 
at com.microsoft.azure.functions.worker.binding.RpcHttpRequestDataSource.computeByName(RpcHttpRequestDataSource.java:20) 
at com.microsoft.azure.functions.worker.binding.BindingDataStore.getDataByName(BindingDataStore.java:55) 
at com.microsoft.azure.functions.worker.broker.ParameterResolver.resolve(ParameterResolver.java:59) 
at com.microsoft.azure.functions.worker.broker.ParameterResolver.resolve(ParameterResolver.java:42) 
at com.microsoft.azure.functions.worker.broker.JavaMethodExecutor.execute(JavaMethodExecutor.java:52) 
at com.microsoft.azure.functions.worker.broker.JavaFunctionBroker.invokeMethod(JavaFunctionBroker.java:53) 
at com.microsoft.azure.functions.worker.handler.InvocationRequestHandler.execute(InvocationRequestHandler.java:33) 
at com.microsoft.azure.functions.worker.handler.InvocationRequestHandler.execute(InvocationRequestHandler.java:10) 
at com.microsoft.azure.functions.worker.handler.MessageHandler.handle(MessageHandler.java:45) 
at com.microsoft.azure.functions.worker.JavaWorkerClient$StreamingMessagePeer.lambda$onNext$0(JavaWorkerClient.java:92) 
at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511) 
at java.util.concurrent.FutureTask.run(FutureTask.java:266) 
at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) 
at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) 
at java.lang.Thread.run(Thread.java:748)
Error

```