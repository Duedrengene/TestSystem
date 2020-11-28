import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

import java.util.ArrayList;


public class FileHandler {
    ArrayList<Users> users = new ArrayList<>();
    ArrayList<Users> students = new ArrayList<>();
    ArrayList<Question> questions = new ArrayList<>();
    Table table;
    Table qTable;
    String userName;
PApplet p;
FileHandler(PApplet p){
    this.p = p;
    table = new Table();
    table = p.loadTable("resources//Dataen.csv","header,csv");
    qTable = p.loadTable("resources//Data questions.csv","header,csv");
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


            users.add(new Users(fornavn, efternavn, username, password, type, score1, score2, score3));

//            p.println(row);
            //          p.println(fornavn + efternavn);

        }

        for(int i = 0;users.size()>i;i++){

            if(users.get(i).type.equals("Elev")){
                students.add(users.get(i));


            }

        }
        for (TableRow row : qTable.rows()) {

            String type = row.getString("Type");
            String question = row.getString("Question");
            String answer = row.getString("Answer");
            String a = row.getString("A");
            String b = row.getString("B");
            String c = row.getString("C");
            String d = row.getString("D");
            questions.add(new Question(p,answer,question,type,a,b,c,d));
        System.out.println(questions.get(0));
        }



    }

    boolean checkPassword(String username,String password){
    userName = username;
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


    void changeScore(int score,int scoreType){
        boolean result = false;
        Table table = new Table();
        table = p.loadTable("resources//Dataen.csv","header,csv");

        for (TableRow row : table.rows()) {



            if(row.getString("Username").equals(userName)){
                if(scoreType ==1)
                row.setInt("Score",score);
                if(scoreType ==2)
                row.setInt("Score2",score);
                if(scoreType ==3)
                row.setInt("Score3",score);

            }
            p.saveTable(table,"resources/Dataen.csv");
        }


    }


}
