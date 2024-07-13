package org.springframework.ai.openai.samples.helloworld;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.ai.openai.api.OpenAiApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestClient;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.function.Consumer;

@Configuration
class Config {

    String baseUrl = "https://api.portkey.ai";

    Consumer<HttpHeaders> defaultHeaders = header -> {
        header.add("x-portkey-api-key", "{{PORTKEY_API_KEY}}");
        header.add("x-portkey-config", "{{PORTKEY_CONFIG}}");
    };

    @Bean
    ChatClient chatClient() {
        RestClient.Builder restClientBuilder = RestClient.builder().defaultHeaders(defaultHeaders);
        WebClient.Builder webClientBuilder = WebClient.builder().defaultHeaders(defaultHeaders);
        OpenAiApi openAiApi = new OpenAiApi(baseUrl, "DUMMY_KEY", restClientBuilder, webClientBuilder);
        OpenAiChatModel openAiChatModel = new OpenAiChatModel(openAiApi);
        return ChatClient.create(openAiChatModel);
    }

}
