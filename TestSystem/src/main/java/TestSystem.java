
import controlP5.*;
import processing.core.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TestSystem extends PApplet {

    ImageLoader iL = new ImageLoader(this);
    String input;
    boolean change = false;
    String passwordinput;

    String userName;
    FileHandler fH;
    int screen = 0;
    DisplayClass display;
    UI uI;
    ControlP5 cp5;
    Quiz quiz;


    public static void main(String[] args) {
        PApplet.main("TestSystem");
/* PROTOTYPE::::
        String q1 = "What Calculation is right? \n" + "(a)Gulerod\n(b)Orange\n(c)Magenta\n";

        String q2 = "What rule in Set theory is true?\n" + "(a)Gulerod\n(b)Yellow\n(c)Blue\n";

        //Tabel over svarene på spørgsmållene.
        Question[] questions = {
                new Question(q1, "a"),
                new Question(q2, "b")

        };
        takteTest(questions);
*/
    }


    public static void takeTest(ArrayList<Question> questions) {
        /* PROTOTYPE::::
        int result = 0;
       // Scanner keyboardtext = new Scanner(System.in);
        for (int i = 0; i < questions.size(); i++) {
            println(questions.get(i).prompt);
          //  String answer = keyboardtext.nextLine(); // Importeret fra Scanner
           // if (answer.equals(questions.get(i).correctAnswer)) {
             //   result++;
            //}
        }
        System.out.println("Your result " + result + "/" + questions.size());*/
    }

    @Override
    public void settings() {
        size(1920, 1080);

    }

    public void setup() {

iL.loadImage();
        cp5 = new ControlP5(this);
        uI = new UI(cp5,iL,this);


        uI.logonobject();

        cp5.setFont(iL.baseFont);

        fH = new FileHandler(this);
        fH.tableData();


        quiz = new Quiz(fH.questions,uI,fH,iL,this);
        display = new DisplayClass(uI, cp5,fH,quiz,iL,this);

quiz.checkQuestions();
    }


    public void draw() {

        background(52,107,49);


        change = display.changeScreen(screen, change, fH.checkType(userName),userName);
display.display();
    }

    public void student(int n){
 display.n = n;


    }

    public void logOn() {

        input = cp5.get(Textfield.class, "fornavn").getText();
        userName = input;
        passwordinput = cp5.get(Textfield.class, "Password").getText();

            if (fH.checkPassword(input, passwordinput)) {
            cp5.remove("fornavn");
            cp5.remove("Password");
            cp5.remove("logOn");


                screen++;
                change = true;

            } else
                cp5.get(Textfield.class, "Password").clear();


        }
        public void A() {

        if(quiz.activeQuestions.get(quiz.i).correctAnswer.equals("A")){

            quiz.score ++;

        }
        quiz.i++;
        quiz.change = true;


        }
        public void B() {

            if(quiz.activeQuestions.get(quiz.i).correctAnswer.equals("B")){

                quiz.score ++;

            }
            quiz.i++;
            quiz.change = true;

        }

        public void C() {

            if(quiz.activeQuestions.get(quiz.i).correctAnswer.equals("C")){

                quiz.score ++;

            }
            quiz.i++;
            quiz.change = true;

        }
        public  void D() {

            if(quiz.activeQuestions.get(quiz.i).correctAnswer.equals("D")){

                quiz.score ++;

            }
            quiz.i++;
            quiz.change = true;

        }

        public void quiz1(){
        display.quizSelected = 1;
        screen=2;
            change = true;


        }

        public void quiz2(){
            display.quizSelected = 2;
            screen=2;
            change = true;



        }
        public void quiz3(){
            display.quizSelected = 3;
            screen=2;
change = true;


        }

        public void back(){
            display.quizSelected = 0;
        screen--;
        change=true;
        quiz.change = true;
        quiz.i=0;
        quiz.score =0;
        }

        }




