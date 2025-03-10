package com.uuhere.processorfactory.factory;

import com.uuhere.processorfactory.processor.Processor;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class ProcessorFactory {
    private final Map<String, Processor<?, ?>> processorMap;

    public ProcessorFactory(Map<String, Processor<?, ?>> processors) {
        this.processorMap = processors.values().stream()
                .collect(Collectors.toMap(Processor::getType, processor -> processor));
    }

    @SuppressWarnings("unchecked")
    public <T, R> Processor<T, R> getProcessor(String type) {
        return Optional.ofNullable((Processor<T, R>) processorMap.get(type))
                .orElseThrow(() -> new IllegalArgumentException("No processor found for type: " + type));
    }
}