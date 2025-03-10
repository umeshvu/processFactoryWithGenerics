package com.uuhere.processorfactory.processor;

public abstract class AbstractProcessor<T, R> implements Processor<T, R> {

    @Override
    public void commonAction() {
        System.out.println(this.getClass().getSimpleName() + ": Executing common action...");
    }
}
