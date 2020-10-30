
import controlP5.*;
import processing.core.*;

import java.util.Scanner;

public class TestSystem extends PApplet {
   String input;

   FileLoader fL;

   ControlP5 cp5;
   
   public static void main(String[] args) {
        PApplet.main("TestSystem");

    String q1 = "What regnestykke er rigtig? \n" + "(a)Gulerod\n(b)Orange\n(c)Magenta\n";

    String q2 = "What rule  in Set theory is true?\n" + "(a)Gulerod\n(b)Yellow\n(c)Blue\n";

    //Tabel over svarene på spørgsmållene.
    UI[] questions = {
            new UI(q1, "a"),
            new UI(q2, "b")

    };
    takeTest(questions);

}


    public static void takeTest(UI [] questions) {
    int result=0;
    Scanner keyboardtext = new Scanner(System.in);
    for(int i = 0; i < questions.length; i++) {
 println(questions[i].prompt);
 String answer = keyboardtext.nextLine(); // Importeret fra Scanner
        if(answer.equals(questions[i].answer)) {
            result++;
        }
        }
System.out.println("Your result " + result + "/" + questions.length);
    }

    @Override
    public void settings() {
        size(1000,500);

    }

    public void setup() {
        cp5 = new ControlP5(this);


        fL = new FileLoader(this);
       fL.tableData();
        UI library= new UI(this);

cp5.addButton("logOn")

        .setPosition(200,205)
        .setSize(183,35)
        ;
cp5.addTextfield("fornavn")
        .setCaptionLabel("fornavn")
        .setPosition(150,13)
        .setSize(283,62)
        .setAutoClear(false)
;
        cp5.addTextfield("Password")
                .setCaptionLabel("Password")
                .setPosition(150,113)
                .setSize(283,62)
                .setAutoClear(false)
        ;
    }


    @Override
    public void draw() {

    }
 
   void logOn() {
        input = cp5.get(Textfield.class,"Brugernavn").getText();


    }

}



