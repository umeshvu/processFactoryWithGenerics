package com.uuhere.processorfactory.service;

import com.uuhere.processorfactory.factory.ProcessorFactory;
import com.uuhere.processorfactory.processor.Processor;
import org.springframework.stereotype.Service;

@Service
public class ProcessorService {
    private final ProcessorFactory processorFactory;

    public ProcessorService(ProcessorFactory processorFactory) {
        this.processorFactory = processorFactory;
    }

    public <T, R> R process(String type, T input) {
        Processor<T, R> processor = processorFactory.getProcessor(type);
        processor.commonAction();
        return processor.uniqueAction(input);
    }
}
