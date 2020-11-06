import controlP5.ControlP5;

import java.io.File;

public class DisplayClass {

    ControlP5 cp5;
    int screen = 0;
    UI uI;
    FileHandler fH;

    DisplayClass(UI uI,ControlP5 cp5,FileHandler fH){
        this.uI = uI;
        this.cp5 = cp5;
        this.fH = fH;
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
        for(int i =0; i<fH.students.size();i++) {
            //cp5.addScrollableList("dropdown")

            fH.students.get(i);

        }
    }
}

        }break;

        default:break;



    }
    return false;


    }




}
