package br.com.rincon.spring.service;

import br.com.rincon.spring.dto.ExplainResponse;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.stereotype.Service;

@Service
public class ExplainService {

    private final OpenAiChatModel chatClient;

    public ExplainService(OpenAiChatModel chatClient) {
        this.chatClient = chatClient;
    }

    public ExplainResponse explain(String question) {
        var javaPrompt = "You are a Java expert. Answer only questions related to Java. " +
                "If the question is not about Java, respond: " +
                "\"Sorry, I can only answer questions about Java.\" \n\n" +
                "Question: " + question;

        return new ExplainResponse(this.chatClient.call(javaPrompt));
    }
}
