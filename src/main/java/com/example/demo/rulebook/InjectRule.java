package com.example.demo.rulebook;


import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;
import com.deliveredtechnologies.rulebook.spring.RuleBean;
import com.example.demo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;

@RuleBean
@Rule(order = 1)
public class InjectRule {
    @Autowired
    private GreetingService greetingService;

    @Result
    private String result;

    @When
    public boolean when() {
        return this.greetingService.alwaysTrue();
    }

    @Then
    public void then() {
        this.result = "Reflection again and again !";
    }
}