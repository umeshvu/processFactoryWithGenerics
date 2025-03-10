package com.uuhere.processorfactory.processor;

import org.springframework.stereotype.Component;

@Component
public class ProcessorB extends AbstractProcessor<Integer, Boolean> {

    @Override
    public Boolean uniqueAction(Integer input) {
        System.out.println("ProcessorB: Processing input: " + input);
        return input % 2 == 0; // Returns true if even, false otherwise
    }

    @Override
    public String getType() {
        return "B";
    }
}