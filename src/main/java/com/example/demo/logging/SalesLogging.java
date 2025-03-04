package com.example.demo.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

public class SalesLogging {

    private static final Logger logger = LoggerFactory.getLogger(SalesLogging.class);

    @PostMapping
    public void createSale(@RequestBody String saleData) {
        logger.info("Creating new sale with data: {}", saleData);
    }
}
