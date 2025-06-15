package quynhttn.example;

import java.util.logging.Logger;

interface Shape {
    void draw();
    void resize();
}

class Square implements Shape {
    static Logger logger = Logger.getLogger(Square.class.getName());

    @Override
    public void draw() {
        logger.info("Drawing square");
    }

    @Override
    public void resize() {
        logger.info("Resize square");
    }

}
