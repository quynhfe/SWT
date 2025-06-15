package quynhttn.example;

import java.io.*;
import java.util.logging.Logger;

public class PathTraversalExample {
    static Logger logger = Logger.getLogger(PathTraversalExample.class.getName());

    public static void main(String[] args) throws IOException {
        String userInput = "secret.txt";
        File file = new File(userInput);
        if (file.exists()) {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            logger.info("Reading file: " + file.getPath());
            reader.close();
        } else {
            logger.warning("File not exists");
        }
    }
}