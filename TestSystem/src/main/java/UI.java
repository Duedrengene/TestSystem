import controlP5.ControlP5;
import controlP5.Textfield;
import controlP5.*;

public class UI {
String input;
    ControlP5 cp5;
    float n;





    UI(ControlP5 cp5) {
        this.cp5 = cp5;

    }


    int screen0() {


        return 0;

    }

    int screen1() {

        return 1;
    }

    int screen2() {


        return 2;
    }


    public void logonobject() {


        System.out.println("Okay");


        cp5.addButton("logOn")
                .setPosition(200, 205)
                .setSize(183, 35)
        ;
        cp5.addTextfield("fornavn")
                .setCaptionLabel("fornavn")
                .setPosition(150, 13)
                .setSize(283, 62)
                .setAutoClear(false)
        ;
        cp5.addTextfield("Password")
                .setCaptionLabel("Password")
                .setPosition(150, 113)
                .setSize(283, 62)
                .setAutoClear(false)
        ;
    }


public void draw() {

}





}
