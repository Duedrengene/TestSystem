import controlP5.ControlP5;

public class DisplayClass {

    ControlP5 cp5;
    int screen = 0;
    UI uI;

    DisplayClass(UI uI){
        this.uI = uI;


    }
void display(){
    switch (screen) {

        case 0:{

          //  uI.logOn();
        }break;

        case 1:{

    cp5.remove("fornavn");
    cp5.remove("Password");
    cp5.remove("logOn");


        }break;

        default:break;



    }



    }




}
