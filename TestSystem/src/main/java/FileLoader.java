import processing.core.PApplet;
import processing.data.StringList;



public class FileLoader {
PApplet p;
FileLoader(PApplet p){
    this.p = p;


}


    StringList  fornavn = new StringList();
    StringList  password = new StringList();
    void tableData(){
        String[] lines = p.loadStrings(".csv");
for(int i =1; i < lines.length; i++) {
        String[]list =(p.split(lines[i],','));
        fornavn.append(list[3]);
        password.append((list[5]));
    }}

}
