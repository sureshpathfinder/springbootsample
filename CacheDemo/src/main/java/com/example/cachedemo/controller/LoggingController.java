package com.example.cachedemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LoggingController {

    private static final Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @GetMapping
    public String logExample() {
        logger.info("INFO: LoggingController accessed.");
        logger.debug("DEBUG: Debugging details...");
        logger.warn("WARN: This is a warning message.");
        logger.error("ERROR: An error occurred!");

        return "Check logs in the console!";
    }
}
