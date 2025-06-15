package quynhttn.example;

import java.util.logging.Logger;

public class OvercatchingExceptionExample {
    static Logger logger = Logger.getLogger(OvercatchingExceptionExample.class.getName());

    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            logger.fine("Array of index 10: " + arr[10]);
        } catch (RuntimeException e) {
            logger.warning("Runtime error");
        }
    }
}
