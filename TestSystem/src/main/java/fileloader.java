import processing.core.PApplet;
import processing.data.StringList;

public class fileloader {
PApplet p;

    StringList  Fornavn = new StringList();
    StringList  Password = new StringList();
    void tabledata(){
        String[] lines = p.loadStrings("".csv);
}for(int i =1 ; i < lines.length; i++) {
        String[]list =(split(lines[i],','));
        Fornavn.append(list[3]);
        Password.append((list[5]));
    }

}
