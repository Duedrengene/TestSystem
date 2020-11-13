import controlP5.ControlP5;
import controlP5.Textfield;
import controlP5.*;
import processing.core.PApplet;
public class UI {
String input;
    ControlP5 cp5;
    float n;
    PApplet p;
    float buttonwidth;
    float buttonheight;
    UI(ControlP5 cp5,PApplet p) {
        this.cp5 = cp5;
        this.p = p;
        buttonwidth = p.width/2;
        buttonheight = p.height/2;

    }

    public void logonobject() {


        System.out.println("Okay");


        cp5.addButton("logOn")
                .setPosition(buttonwidth-91, buttonheight-50)
                .setSize(182, 45)
        ;
        cp5.addTextfield("fornavn")
                .setCaptionLabel("fornavn")
                .setPosition(buttonwidth-141, buttonheight-250)
                .setSize(282, 62)
                .setAutoClear(false)
        ;
        cp5.addTextfield("Password")
                .setCaptionLabel("Password")
                .setPosition(buttonwidth-141, buttonheight-150)
                .setSize(282, 62)
                .setAutoClear(false)
        ;
    }








}
