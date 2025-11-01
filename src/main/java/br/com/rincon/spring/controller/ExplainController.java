package br.com.rincon.spring.controller;

import br.com.rincon.spring.dto.ExplainRequest;
import br.com.rincon.spring.dto.ExplainResponse;
import br.com.rincon.spring.service.ExplainService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/explain")
public class ExplainController {

    private final ExplainService explainService;

    public ExplainController(ExplainService explainService) {
        this.explainService = explainService;
    }

    @GetMapping("/java")
    public ExplainResponse explainJavaChat(@RequestBody ExplainRequest explainRequest) {
        var question = explainRequest.question();
        return this.explainService.explain(question);
    }
}
