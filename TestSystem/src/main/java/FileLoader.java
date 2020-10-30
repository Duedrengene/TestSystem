import processing.core.PApplet;
import processing.data.StringList;
import processing.data.Table;
import processing.data.TableRow;


public class FileLoader {
PApplet p;
FileLoader(PApplet p){
    this.p = p;


}


  //  StringList  fornavn = new StringList();
    //StringList  password = new StringList();
    void tableData() {
        Table table = new Table();

        table = p.loadTable("resources//Data.csv","header,csv");
        System.out.println(table);
        p.println(table.getColumnTitle(0) + " total rows in table");
        for (TableRow row : table.rows()) {
            row.setString("Fornavn","Mathias ");
            String fornavn = row.getString("Fornavn");
            String efternavn = row.getString("Efternavn");
            p.println(row);


            p.println(fornavn + efternavn);
        }
        p.saveTable(table,"lol.csv","/resources");
    }

}
