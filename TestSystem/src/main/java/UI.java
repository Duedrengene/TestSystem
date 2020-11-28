import controlP5.ControlP5;
import controlP5.Textfield;
import controlP5.*;
import processing.core.PApplet;
import processing.core.PImage;

import java.util.ArrayList;

public class UI {
String input;
    ControlP5 cp5;

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

public void removeQuizOptions(){
    cp5.remove("A");
    cp5.remove("B");
    cp5.remove("C");
    cp5.remove("D");


}
    public void addQuizOptions(ArrayList<Question> list,int i){
removeQuizOptions();

        cp5.addButton("A")
                .setPosition(buttonwidth-600,buttonheight-150)
                .setSize(400,250)
                .setLabel(list.get(i).a)
        ;
        cp5.addButton("B")
                .setPosition(buttonwidth-600,buttonheight+150)
                .setSize(400,250)
                .setLabel(list.get(i).b)

        ;
        cp5.addButton("C")
                .setPosition(buttonwidth+150,buttonheight-150)
                .setSize(400,250)
                .setLabel(list.get(i).c)

        ;
        cp5.addButton("D")
                .setPosition(buttonwidth+150,buttonheight+150)
                .setSize(400,250)
                .setLabel(list.get(i).d)

        ;

    }

    public void addScrollList(ArrayList<String> list){
        cp5.remove("fornavn");
        cp5.remove("Password");
        cp5.remove("logOn");



        cp5.addScrollableList("student")

                .setPosition(100, 100)
                .setSize(200, 300)
                .setBarHeight(20)
                .setItemHeight(20)
                .addItems(list);


    }


    public void quizSelect(String one,String two,String three){
        cp5.addButton("quiz1")
                .setPosition(buttonwidth-700,buttonheight)
                .setSize(400,250)
                .setLabel(one)

        ;
        cp5.addButton("quiz2")
                .setPosition(buttonwidth-200,buttonheight)
                .setSize(400,250)
                .setLabel(two)

        ;
        cp5.addButton("quiz3")
                .setPosition(buttonwidth+300,buttonheight)
                .setSize(400,250)
                .setLabel(three)

        ;

    }

    public void removeQuizSelect(){

        cp5.remove("quiz1");
        cp5.remove("quiz2");
        cp5.remove("quiz3");




    }



}
