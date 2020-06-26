# Sample 

Related to: https://github.com/micronaut-projects/micronaut-azure/issues/5


Sample demonstrating issue with HTTP Azure Function and Micronaut Azure Function support.

Based on Micronaut launch configuration 2.0.0.BUILD-SNAPSHOT and 2.0.0.RC1

## How to reproduce

- Deploy to Azure as Function
- Invoke HTTP GET several times 
  `https://<your-function-name>>.azurewebsites.net/api/hello/memorybomb`
- the service performance degrades and ultimately ends in an out-of-memory-exception
