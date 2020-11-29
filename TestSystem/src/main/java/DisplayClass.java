import controlP5.ControlP5;
import processing.core.PApplet;

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
    ImageLoader iL;
    int quizSelected = 0;
    int n = -1;




    DisplayClass(UI uI, ControlP5 cp5,FileHandler fH,Quiz quiz, ImageLoader iL,PApplet p){


        this.uI = uI;
        this.cp5 = cp5;
        this.fH = fH;
        this.p = p;
        this.quiz=quiz;
        this.buttonheight = uI.buttonHeight;
        this.buttonwidth = uI.buttonWidth;
        this.iL = iL;
        p.textFont(iL.titelFont);

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
    p.clear();

    switch (screen) {

        case 0:{
           if (change) {
               n=-1;
               uI.removeScrollList();
               cp5.setFont(iL.baseFont);
               uI.removeBack();
                uI.removeQuizSelect();
                uI.logonobject();

            }
            p.background(iL.background);
        }break;

        case 1:{
            p.background(122);
if(change) {
    if(!isStudent){
students.clear();
        for(int i = 0; i<fH.students.size(); i++) {

            students.add(fH.students.get(i).fullName);

        }
   uI.addScrollList(students);
uI.back();
    }else {
        uI.removeQuizOptions();
        quiz.quizSelect();
        uI.back();

}


        }break;





    }
        case 2:{
            p.background(122);
            if(change) {
                quiz.startQuiz(quizSelected);
                uI.back();
            }

            quiz.showQuestion();
        }break;
        default:break;
        }



    return false;


    }



}
