package com.uuhere.processorfactory.processor;

import org.springframework.stereotype.Component;

@Component
public class ProcessorA extends AbstractProcessor<String, Integer> {

    @Override
    public Integer uniqueAction(String input) {
        System.out.println("ProcessorA: Processing input: " + input);
        return input.length(); // Returns length of string as Integer
    }

    @Override
    public String getType() {
        return "A";
    }
}
