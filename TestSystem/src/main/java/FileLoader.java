import processing.core.PApplet;
import processing.data.StringList;
import processing.data.Table;
import processing.data.TableRow;


public class FileLoader {
PApplet p;
FileLoader(PApplet p){
    this.p = p;


}


 
    void tableData() {
        Table table = new Table();

        table = p.loadTable("resources//Dataen.csv","header,csv");
        System.out.println(table);
        p.println(table.getColumnTitle(0) + " total rows in table");
        for (TableRow row : table.rows()) {
            row.setString("Fornavn","Mathias ");
            String fornavn = row.getString("Fornavn");
            String efternavn = row.getString("Efternavn");
            p.println(row);
            p.println(fornavn + efternavn);

            String id = row.getString("ID");

        }

    }

    boolean checkPassword(String username,String password){
    boolean result = false;
    Table table = new Table();
    table = p.loadTable("resources//Dataen.csv","header,csv");

        for (TableRow row : table.rows()) {

            if(row.getString("Username").equals(username)){
                if(row.getString("Password").equals(password))
                result = true;
            }

        }

    return result;
    }

    void changeScore(String username,int score){
        boolean result = false;
        Table table = new Table();
        table = p.loadTable("resources//Dataen.csv","header,csv");

        for (TableRow row : table.rows()) {



            if(row.getString("Username").equals(username)){
                row.setInt("Score",score);

            }
            p.saveTable(table,"resources/new.csv");
        }


    }


}
