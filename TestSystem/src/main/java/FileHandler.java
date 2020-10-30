import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class FileHandler {
    PApplet p;
    FileLoader fL;
    Table table;
    FileHandler(PApplet p, Table table){
        this.p = p;
        this.fL = fL;
        this.table = table;
    }


     boolean checkPass(String username,String password){
        boolean result = false;

        for(TableRow row: table.rows()){

            if(row.getString("username").equals(username)&& row.getString("password").equals(password)){

                result = true;
                break;
            }

        }


        return result;
     }

}
