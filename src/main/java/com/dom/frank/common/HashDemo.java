package com.dom.frank.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HashDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(HashDemo.class);

    public static void main(String[] args) {
        String test = "ludong";
        LOGGER.info("The string's hashCode is {} ", test.hashCode());
    }
}
