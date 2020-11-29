import controlP5.ControlP5;
import processing.core.PApplet;

import java.util.ArrayList;

public class UI {
String input;
    ControlP5 cp5;
    ImageLoader iL;
    PApplet p;
    float buttonWidth;
    float buttonHeight;
    UI(ControlP5 cp5,ImageLoader iL,PApplet p) {
        this.cp5 = cp5;
        this.p = p;
        this.iL = iL;
        buttonWidth = p.width/2;
        buttonHeight = p.height/2;

    }
    public void logonobject() {



        cp5.addButton("logOn")
                .setPosition(buttonWidth -91, buttonHeight -50)
                .setSize(182, 45)
                .setColorValue(0)
                .setColorLabel(0)
        ;
        cp5.addTextfield("fornavn")
                .setCaptionLabel("Username")
                .setPosition(buttonWidth -141, buttonHeight -250)
                .setSize(282, 62)
                .setAutoClear(false)
                .setColorValue(000000)
                .setColorLabel(000000)
        ;
        cp5.addTextfield("Password")
                .setCaptionLabel("Password")
                .setPosition(buttonWidth -141, buttonHeight -150)
                .setSize(282, 62)
                .setAutoClear(false)
                .setColorValue(000000	)
                .setColorLabel(000000)
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
        cp5.setFont(iL.titelFont);

        cp5.addButton("A")
                .setPosition(buttonWidth -600, buttonHeight -150)
                .setSize(400,250)
                .setLabel(list.get(i).a)
        ;
        cp5.addButton("B")
                .setPosition(buttonWidth -600, buttonHeight +150)
                .setSize(400,250)
                .setLabel(list.get(i).b)

        ;
        cp5.addButton("C")
                .setPosition(buttonWidth +150, buttonHeight -150)
                .setSize(400,250)
                .setLabel(list.get(i).c)

        ;
        cp5.addButton("D")
                .setPosition(buttonWidth +150, buttonHeight +150)
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
                .setSize(400, 300)
                .setBarHeight(20)
                .setItemHeight(20)
                .addItems(list);


    }


    public void removeScrollList(){

        cp5.remove("student");


    }

    public void quizSelect(String one,String two,String three){
        cp5.setFont(iL.titelFont);

        cp5.addButton("quiz1")
                .setPosition(buttonWidth -700, buttonHeight)
                .setSize(400,250)
                .setLabel(one)


        ;
        cp5.addButton("quiz2")
                .setPosition(buttonWidth -200, buttonHeight)
                .setSize(400,250)
                .setLabel(two)

        ;
        cp5.addButton("quiz3")
                .setPosition(buttonWidth +300, buttonHeight)
                .setSize(400,250)
                .setLabel(three)

        ;

    }

    public void removeQuizSelect(){

        cp5.remove("quiz1");
        cp5.remove("quiz2");
        cp5.remove("quiz3");




    }

    public void back(){
        cp5.addButton("back")
                .setPosition(50 , 50)
                .setSize(50,50)
                .setLabel("Go Back")
        ;

    }
public void removeBack(){
        cp5.remove("back");


}

}
