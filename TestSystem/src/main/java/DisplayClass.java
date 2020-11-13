import controlP5.ControlP5;
import processing.core.PApplet;
import java.io.File;
import java.util.ArrayList;

public class DisplayClass {

    ControlP5 cp5;
PApplet p;
    UI uI;
    FileHandler fH;
    ArrayList<String> students = new ArrayList<>();

    int n = -1;

    DisplayClass(UI uI, ControlP5 cp5,FileHandler fH,PApplet p){
        this.uI = uI;
        this.cp5 = cp5;
        this.fH = fH;
        this.p = p;
    }

    void display(){
if (n!= -1) {
    String score1 = fH.students.get(n).score1;
    String score2 = fH.students.get(n).score2;
    String score3 = fH.students.get(n).score3;

    p.textSize(20);

    p.text("Score1", p.width/2 - 100, 150);
    p.text("Score2", p.width/2, 150);
    p.text("Score3", p.width/2 + 100, 150);
    p.text(score1, p.width/2 - 100, 200);
    p.text(score2, p.width/2, 200);
    p.text(score3, p.width/2 + 100, 200);
}

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
    if(!isStudent){
        for(int i = 0; i<fH.students.size(); i++) {
students.add(fH.students.get(i).fullName);

        }

        cp5.addScrollableList("student")

                .setPosition(100, 100)
                .setSize(200, 300)
                .setBarHeight(20)
                .setItemHeight(20)
                .addItems(students);
    }
}

        }break;

        default:break;



    }
    return false;


    }




}
