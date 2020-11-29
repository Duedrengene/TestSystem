import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;
//This class is for making the quistions object-oriented, which would become handy later on.
public class Question {
PApplet p;

String correctAnswer;
String prompt;
String type;
String a;
String b;
String c;
String d;

public Question(PApplet p,String correctAnswer,String prompt,String type,String a,String b,String c,String d){

this.p = p;
this.correctAnswer = correctAnswer;
this.prompt = prompt;
this.type = type;
this.a= a;
this.b=b;
this.c=c;
this.d=d;
}







}
