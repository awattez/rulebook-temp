package com.example.demo;

import com.deliveredtechnologies.rulebook.model.RuleBook;
import com.deliveredtechnologies.rulebook.spring.SpringAwareRuleBookRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RulesBookConfiguration {

    @Bean
    public RuleBook<String> greetingRuleBook() {
        return new SpringAwareRuleBookRunner("com.example.demo.rulebook");
    }
}
