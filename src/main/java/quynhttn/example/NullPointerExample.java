package quynhttn.example;

import java.util.logging.Logger;

public class NullPointerExample {
    static Logger logger = Logger.getLogger(NullPointerExample.class.getName());
    public static void main(String[] args) {
        try {
            String text = null;
            if (!text.isEmpty()) {
                logger.info("Text is not empty");
            } else {
                logger.info("Text is null or empty");
            }
        } catch (NullPointerException e) {
            logger.severe("NullPointerException caught: " + e.getMessage());
        }
    }
}

