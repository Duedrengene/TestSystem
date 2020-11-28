import processing.core.PApplet;
import processing.core.PImage;

public class ImageLoader {

PApplet p;
PImage background;
    ImageLoader(PApplet p){

this.p = p;

    }



   public void  loadImage(){
background = p.loadImage("resources//cool.PNG");


            }


}
