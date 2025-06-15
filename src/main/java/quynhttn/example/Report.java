package quynhttn.example;

import java.util.logging.Logger;

class Printer {
    static Logger logger = Logger.getLogger(Printer.class.getName());

    void print(String message) {
        logger.info(message);
    }
}

class Report {
    private Printer printer = new Printer(); // tightly coupled

    void generate() {
        printer.print("Generating report...");
    }
}
