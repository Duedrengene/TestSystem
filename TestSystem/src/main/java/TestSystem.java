
import controlP5.*;
import processing.core.*;

public class TestSystem extends PApplet {


    public static void main(String[] args ) {
        PApplet.main("name");

    }

    @Override
    public void setup() {
        ControlP5 cp5 = new ControlP5(this);

        tabledata();

        UI library= new UI(this);

    }


    @Override
    public void draw() {

    }



}
