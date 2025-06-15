package quynhttn.example;

import java.util.logging.Logger;
class Animal {
    static Logger logger = Logger.getLogger(Animal.class.getName());
    void speak() {
       logger.info("Animal speaks");
    }
}

class Dog extends Animal {
    static Logger logger = Logger.getLogger(Dog.class.getName());
    @Override
    void speak() {
        logger.info("Dog barks");
    }
}
