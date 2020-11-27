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
    Quiz quiz;
    int quizSelected = 0;
    int n = -1;




    DisplayClass(UI uI, ControlP5 cp5,FileHandler fH,Quiz quiz,PApplet p){


        this.uI = uI;
        this.cp5 = cp5;
        this.fH = fH;
        this.p = p;
        this.quiz=quiz;
        this.buttonheight = uI.buttonheight;
        this.buttonwidth = uI.buttonwidth;

    }

    void display(){
if (n!= -1) {
    String score1 = fH.students.get(n).score1;
    String score2 = fH.students.get(n).score2;
    String score3 = fH.students.get(n).score3;
    p.textAlign(p.CENTER);
    if(score1.equals("")){
        score1 = "Quiz ikke taget";
    }
    if(score2.equals("")){
        score2 = "Quiz ikke taget";
    }
    if(score3.equals("")){
        score3 = "Quiz ikke taget";
    }

    p.textSize(20);

    p.text("Score1", p.width/2 - 300, 150);
    p.text("Score2", p.width/2, 150);
    p.text("Score3", p.width/2 + 300, 150);

    p.text(score1, p.width/2 -300, 200);
    p.text(score2, p.width/2, 200);
    p.text(score3, p.width/2 + 300, 200);

}




    }
    /*
void studentTest(){
        if(n==-1) {
            String questiontitel = String.valueOf(question);


        }

}*/
boolean changeScreen(int screen, boolean change,boolean isStudent){
    switch (screen) {

        case 0:{

        }break;

        case 1:{
if(change) {
    if(!isStudent){
        for(int i = 0; i<fH.students.size(); i++) {
            students.add(fH.students.get(i).fullName);

        }
   uI.addScrollList(students);
    }else {

        quiz.quizSelect();


}


        }break;





    }
        case 3:{
            if(change) {
                quiz.startQuiz(quizSelected);
            }

            quiz.showQuestion();
        }break;
        default:break;
        }



    return false;


    }



}
