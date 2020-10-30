import processing.core.PApplet;
import processing.data.StringList;
import processing.data.Table;
import processing.data.TableRow;


public class FileLoader {
PApplet p;
    String fornavn;
    String efternavn;
    String username;
    String password;
    Table table = new Table();

    FileLoader(PApplet p){
    this.p = p;


}


 
    void tableData() {


        table = p.loadTable("resources//Dataen.csv","header,csv");
        System.out.println(table);
        p.println(table.getColumnTitle(0) + " total rows in table");
        for (TableRow row : table.rows()) {
            row.setString("Fornavn","MATHIAS");
        fornavn  =    row.getString("Fornavn");
        efternavn = row.getString("Efternavn");
        username  = row.getString("Efternavn");
        password   = row.getString("Efternavn");

            p.println(row);
            p.println(fornavn + efternavn);

            String id = row.getString("ID");

        }
    }

}
