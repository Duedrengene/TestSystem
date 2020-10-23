
import controlP5.*;
import processing.core.*;

public class TestSystem extends PApplet {


    public static void main(String[] args ) {
        PApplet.main("TestSystem");

    }
    FileLoader fL;
    @Override
    public void setup() {
        ControlP5 cp5 = new ControlP5(this);
        fL = new FileLoader(this);
        fL.tableData();
        UI library= new UI(this);

    }


    @Override
    public void draw() {

    }



}
