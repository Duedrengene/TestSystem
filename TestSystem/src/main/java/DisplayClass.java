import controlP5.ControlP5;
import processing.core.PApplet;
import java.io.File;
import java.util.ArrayList;

public class DisplayClass {
    float buttonwidth;
    float buttonheight;
    ControlP5 cp5;
PApplet p;
    UI uI;
    FileHandler fH;
    ArrayList<String> students = new ArrayList<>();


    DisplayClass(UI uI, ControlP5 cp5,FileHandler fH, PApplet p){
        this.uI = uI;
        this.cp5 = cp5;
        this.fH = fH;
        this.p = p;
        this.buttonheight = uI.buttonheight;
        this.buttonwidth = uI.buttonwidth;

    }
boolean changeScreen(int screen, boolean change,boolean isStudent){
    switch (screen) {

        case 0:{

        }break;

        case 1:{
if(change) {
    cp5.remove("fornavn");
    cp5.remove("Password");
    cp5.remove("logOn");
    if (!isStudent) {
        for (int i = 2; i < fH.students.size(); i++) {
            students.add(fH.students.get(i));

        }

        cp5.addScrollableList("student")

                .setPosition(100, 100)
                .setSize(200, 300)
                .setBarHeight(20)
                .setItemHeight(20)
                .addItems(students);
    }
}else {
    if(isStudent) {
        cp5.addButton("answer1")
                .setPosition(buttonwidth-600,buttonheight-150)
                .setSize(400,250)
                ;
        cp5.addButton("answer2")
.setPosition(buttonwidth-600,buttonheight+150)
.setSize(400,250)
;
        cp5.addButton("answer3")
                .setPosition(buttonwidth+150,buttonheight-150)
                .setSize(400,250)
                ;
        cp5.addButton("answer4")
                .setPosition(buttonwidth+150,buttonheight+150)
                .setSize(400,250)
                ;
    }
}

        }break;

        default:break;



    }
    return false;


    }




}
