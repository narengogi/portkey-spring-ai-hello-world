# Spring AI with Portkey

## Steps to run
- Substitute your Portkey API Key and Config slug in the [Config](https://github.com/narengogi/portkey-spring-ai-hello-world-example/blob/main/src/main/java/org/springframework/ai/openai/samples/helloworld/Config.java) class
- Set a dummy openai key using the configuration property `spring.ai.openai.api-key` or `export SPRING_AI_OPENAI_API_KEY=<INSERT KEY HERE>` (You can set it to any random value and it will not be used)

## usage
```
```shell
curl --get  --data-urlencode 'message=Tell me a joke about a cow.' localhost:8080/ai 
```


This repository is forked from [spring-ai-hello-world](https://github.com/rd-1-2022/ai-openai-helloworld/tree/main)
