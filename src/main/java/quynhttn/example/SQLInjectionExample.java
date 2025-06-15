package quynhttn.example;


import java.util.logging.Logger;

public class SQLInjectionExample {
    static Logger logger = Logger.getLogger(SQLInjectionExample.class.getName());

    public static void main(String[] args) {
        String userInput = "' OR '1'='1";
        String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
        logger.info("Executing query: " + query);
    }
}
