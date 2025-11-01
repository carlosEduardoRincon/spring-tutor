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
        return new ExplainResponse(this.chatClient.call(question));
    }
}
