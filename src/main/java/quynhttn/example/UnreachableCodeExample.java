package quynhttn.example;

import java.util.logging.Logger;

public class UnreachableCodeExample {
    static Logger logger = Logger.getLogger(UnreachableCodeExample.class.getName());
    static final int NUMBER = 42;

    public static int getNumber() {
        return NUMBER;
    }

    public static void main(String[] args) {
        logger.info("The number is: "+getNumber());
    }
}

