package quynhttn.example;

import java.util.logging.Logger;

public class CatchGenericExceptionExample {
    static Logger logger = Logger.getLogger(CatchGenericExceptionExample.class.getName());

    public static void main(String[] args) {
        try {
            String s = "nam";
            logger.info(""+s.length());
        } catch (Exception e) {
            logger.info("Something went wrong");
        }
    }
}

