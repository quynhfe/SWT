package quynhttn.example;
import java.io.*;
import java.util.logging.Logger;

public class ResourceLeakExample {
    static Logger logger = Logger.getLogger(ResourceLeakExample.class.getName());

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                logger.info(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
