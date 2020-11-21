
import controlP5.*;
import processing.core.*;

import java.util.Scanner;

public class TestSystem extends PApplet {
    String input;
    boolean change = false;
    String passwordinput;


    String userName;
    FileHandler fH;
    int screen = 0;
    DisplayClass display;
    UI uI;
    ControlP5 cp5;

    public static void main(String[] args) {
        PApplet.main("TestSystem");

        String q1 = "What Calculation is right? \n" + "(a)Gulerod\n(b)Orange\n(c)Magenta\n";

        String q2 = "What rule in Set theory is true?\n" + "(a)Gulerod\n(b)Yellow\n(c)Blue\n";

        //Tabel over svarene på spørgsmållene.
        Question[] questions = {
                new Question(q1, "a"),
                new Question(q2, "b")

        };
        takeTest(questions);

    }


    public static void takeTest(Question[] questions) {
        int result = 0;
        Scanner keyboardtext = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            println(questions[i].prompt);
            String answer = keyboardtext.nextLine(); // Importeret fra Scanner
            if (answer.equals(questions[i].answer)) {
                result++;
            }
        }
        System.out.println("Your result " + result + "/" + questions.length);
    }

    @Override
    public void settings() {
        size(1920, 1080);

    }

    public void setup() {

        cp5 = new ControlP5(this);
        uI = new UI(cp5,this);


        uI.logonobject();


        fH = new FileHandler(this);
        fH.tableData();
        Question library = new Question(this);


        display = new DisplayClass(uI, cp5,fH,this);


    }


    public void draw() {
        background(122);
        change = display.changeScreen(screen, change, fH.checkType(userName));
display.display();
display.studentTest();
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


                println("Stinke");
                screen++;
                change = true;

            } else
                cp5.get(Textfield.class, "Password").clear();


        }
        public void answer1() {
        text("Test",200,200);
        }
        public void answer2() {
        text("u stinky",200,400);
        }

        public void answer3() {
        text("omega stink", 300, 300);
        }
        public  void answer4() {
            text("beck stinker",400,500);
            }
        }




