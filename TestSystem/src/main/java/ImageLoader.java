import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class ImageLoader {

PApplet p;
PImage background;
PFont titelFont;
PFont baseFont;
    ImageLoader(PApplet p){

this.p = p;

    }



   public void  loadImage(){
background = p.loadImage("resources//cool.PNG");
titelFont = p.loadFont("resources//Georgia-25.vlw");
       baseFont = p.loadFont("resources//Georgia-12.vlw");
            }


}
