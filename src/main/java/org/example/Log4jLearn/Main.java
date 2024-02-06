package org.example.Log4jLearn;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class Main {
    private static final Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws IOException {

        log.error("error");
        log.info("info");
        log.debug("debug");
        log.trace("trace");
        log.debug("Hello this is a debug message");
        log.info("Hell this is an info message");

    }
}
