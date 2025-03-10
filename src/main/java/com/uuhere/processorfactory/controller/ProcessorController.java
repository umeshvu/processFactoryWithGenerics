package com.uuhere.processorfactory.controller;

import com.uuhere.processorfactory.service.ProcessorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/process")
public class ProcessorController {
    private final ProcessorService processorService;

    public ProcessorController(ProcessorService processorService) {
        this.processorService = processorService;
    }

    //http://localhost:8080/process/string/A/hello
    @GetMapping("/string/{type}/{input}")
    public Integer processString(@PathVariable String type, @PathVariable String input) {
        return processorService.process(type, input);
    }

    //http://localhost:8080/process/integer/B/10
    @GetMapping("/integer/{type}/{input}")
    public Boolean processInteger(@PathVariable String type, @PathVariable Integer input) {
        return processorService.process(type, input);
    }
}
