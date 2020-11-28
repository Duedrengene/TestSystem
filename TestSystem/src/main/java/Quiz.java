import controlP5.ControlP5;
import processing.core.PApplet;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;

public class Quiz {
boolean change = true;
FileHandler fH;
int questionType;
ImageLoader iL;
int score;

    PApplet p;
    ArrayList<Question> activeQuestions =new ArrayList<>();
    String type1="Ikke Tilgængelig";
    String type2="Ikke Tilgængelig";
    String type3="Ikke Tilgængelig";
    ArrayList<Question> questions;
    ArrayList<Question> questions1 = new ArrayList<>();
    ArrayList<Question> questions2 = new ArrayList<>();
    ArrayList<Question> questions3 = new ArrayList<>();
    int i =0;

    UI uI;


    Quiz(ArrayList<Question> questions, UI uI, FileHandler fH, ImageLoader iL, PApplet p){
this.fH = fH;
        this.uI=uI;
        this.questions = questions;
        this.p = p;
        this.iL=iL;
    }

    public void checkQuestions() {

        for (int i = 0; questions.size() > i; i++) {

            if (type1.equals("Ikke Tilgængelig")) {
                type1 = questions.get(i).type;

            } else if (type2.equals("Ikke Tilgængelig")) {
                if (!questions.get(i).type.equals(type1)) {
                    type2 = questions.get(i).type;
                }
            } else if (type3.equals("Ikke Tilgængelig")) {
                if (!questions.get(i).type.equals(type1) && !questions.get(i).type.equals(type2)) {
                    type3 = questions.get(i).type;
                    break;
                }
            }

            if (questions.get(i).type.equals(type1)) {
                questions1.add(questions.get(i));

            }
            if (questions.get(i).type.equals(type2)) {
                questions2.add(questions.get(i));

            }
            if (questions.get(i).type.equals(type3)) {
                questions3.add(questions.get(i));

            }
        }
    }








    public void startQuiz(int quizType){




    switch(quizType){

        case 1: activeQuestions = questions1; questionType=1;break;
        case 2:activeQuestions = questions2;questionType=2;break;
        case 3:activeQuestions = questions3;questionType=3;break;


    }
        uI.removeQuizSelect();



    }


    public void quizSelect(){

uI.quizSelect(type1,type2,type3);



    }

    public void showQuestion(){
if(activeQuestions.size()>i) {
    if(change) {

        uI.addQuizOptions(activeQuestions, i);
        change=false;
    }




    p.textFont(iL.titelfont);
    p.text(activeQuestions.get(i).prompt, 1920 / 2-275, 300);

}else {
    if (change) {
        uI.removeQuizOptions();
        change = false;

        fH.changeScore(score, questionType);
    }
    if (score != activeQuestions.size()) {
        p.textSize(22);
        p.text("Du fik " + score + " point ud af" + activeQuestions.size() + " bedre held næste gang", p.width / 2, 200);
    } else
            p.textSize(22);
            p.text("Du fik " + score + " point ud af" + activeQuestions.size(), p.width / 2, 200);
            p.text("Flot arbejde makker!",p.width/2,150);

}

    }


}
