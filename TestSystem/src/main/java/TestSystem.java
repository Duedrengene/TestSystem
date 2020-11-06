
import controlP5.*;
import processing.core.*;

import java.util.Scanner;

public class TestSystem extends PApplet {
    String input;
    String passwordinput;
    FileLoader fL;
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
        size(1000, 500);

    }

    public void setup() {

        cp5 = new ControlP5(this);
        uI = new UI(cp5);


        uI.logonobject();


        fL = new FileLoader(this);
        fL.tableData();
        Question library = new Question(this);
        this.display = new DisplayClass(uI);
    }


    public void draw() {
display.display();

    }

    public void logOn() {

        input = cp5.get(Textfield.class, "fornavn").getText();
        passwordinput = cp5.get(Textfield.class, "Password").getText();
        if (fL.checkPassword(input, passwordinput)){

            println("Stinke");
            display.screen++;
    }
       else
           cp5.get(Textfield.class, "Password").clear();



    }
}
