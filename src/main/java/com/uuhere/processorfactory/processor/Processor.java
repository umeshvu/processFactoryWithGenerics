package com.uuhere.processorfactory.processor;

public interface Processor<T, R> {
    void commonAction();  // Common action

    R uniqueAction(T input);  // Unique action for each processor

    String getType();     // To identify processor type
}
