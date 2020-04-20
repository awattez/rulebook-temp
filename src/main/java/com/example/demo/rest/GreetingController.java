package com.example.demo.rest;

import com.deliveredtechnologies.rulebook.FactMap;
import com.deliveredtechnologies.rulebook.model.RuleBook;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final RuleBook<String> greetingRuleBook;

    public GreetingController(RuleBook<String> greetingRuleBook) {
        this.greetingRuleBook = greetingRuleBook;
    }

    @GetMapping("/greeting")
    public String greeting() throws RuntimeException {
        greetingRuleBook.run(new FactMap<Void>());
        var result = greetingRuleBook.getResult().orElseThrow();
        return result.getValue();
    }
}