
import controlP5.*;
import processing.core.*;

public class TestSystem extends PApplet {
    String input;
    FileLoader fL;
    ControlP5 cp5;
    FileHandler fH;


    public static void main(String[] args ) {
        PApplet.main("TestSystem");

    }

    @Override
    public void settings() {
        size(1000,500);

    }

    public void setup() {
        cp5 = new ControlP5(this);


        fL = new FileLoader(this);
        fH = FileHandler(this,fL.table);
       fL.tableData();
        UI library= new UI(this);
cp5.addButton("log On")
        .setPosition(200,205)
        .setSize(183,35)
        ;
cp5.addTextfield("Brugernavn")
        .setCaptionLabel("Brugernavn")
        .setPosition(150,13)
        .setSize(283,62)
        .setAutoClear(false)
;
        cp5.addTextfield("Password")
                .setCaptionLabel("Password")
                .setPosition(150,113)
                .setSize(283,62)
                .setAutoClear(false)
        ;
    }


    @Override
    public void draw() {

    }
   void logOn() {
        input = cp5.get(Textfield.class,"Brugernavn").getText();

    }

}



