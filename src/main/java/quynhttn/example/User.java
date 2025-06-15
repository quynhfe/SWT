package quynhttn.example;

import java.util.logging.Logger;

class User {
    private String name;
    private int age;
    static Logger logger = Logger.getLogger(User.class.getName());

    public void display() {

        logger.fine("Name: " + name + ", Age: " + age);
    }
}
