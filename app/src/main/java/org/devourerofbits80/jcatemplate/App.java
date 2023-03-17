package org.devourerofbits80.jcatemplate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class App {

    private static final String ERROR_MESSAGE = "Could not invoke constructor for the main method class";
    private static final String HELLO_WORLD = "jcaTemplate says... HeLLo WorLd!";

    private App() {
        throw new UnsupportedOperationException(ERROR_MESSAGE);
    }

    public static void main(final String[] args) {
        log.info("Application started...");
        System.out.println(HELLO_WORLD);
    }
}
