import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

import java.util.ArrayList;


public class FileHandler {
    ArrayList<Users> users = new ArrayList<>();
    ArrayList<Users> students = new ArrayList<>();
    Table table;
PApplet p;
FileHandler(PApplet p){
    this.p = p;
    table = new Table();
    table = p.loadTable("resources//Dataen.csv","header,csv");

}


 
    void tableData() {


        System.out.println(table);
        p.println(table.getColumnTitle(0) + " total rows in table");
        for (TableRow row : table.rows()) {
       //     row.setString("Fornavn","Mathias ");
            String username = row.getString("Username");
            String password = row.getString("Password");
            String fornavn = row.getString("Fornavn");
            String efternavn = row.getString("Efternavn");
            String type = row.getString("Type");
            String score1 = row.getString("Score");
            String score2 = row.getString("Score2");
            String score3 = row.getString("Score3");

            users.add(new Users(fornavn, efternavn,username, password,type,score1,score2,score3));

//            p.println(row);
  //          p.println(fornavn + efternavn);

        }

        for(int i = 0;users.size()>i;i++){

            if(users.get(i).type.equals("Elev")){
                students.add(users.get(i));


            }

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


     boolean checkType(String userName) {

         boolean result = true;//true = elev, false =Lærer

         for (TableRow row : table.rows())
             if (row.getString("Type").equals("Lærer") && row.getString("Username").equals(userName))
                 result = false;
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