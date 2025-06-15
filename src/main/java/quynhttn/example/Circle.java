package quynhttn.example;

import java.util.logging.Logger;

interface Drawable {
    void draw();
}

class Circle implements Drawable {
    static Logger logger = Logger.getLogger(Circle.class.getName());

    @Override
    public void draw() {
        logger.info("Drawing a circle");
    }
}


