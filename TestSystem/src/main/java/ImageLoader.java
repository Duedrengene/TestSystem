import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class ImageLoader {

PApplet p;
PImage background;
PFont titelfont;
    ImageLoader(PApplet p){

this.p = p;

    }



   public void  loadImage(){
background = p.loadImage("resources//cool.PNG");
titelfont= p.createFont("resources//Georgia.ttf",32);

            }


}
