public class Users {

    String firstName;
    String lastName;
    String type;
    String score1;
    String score2;
    String score3;
    String username;
    String password;
    String fullName;


    Users(String firstName,String lastName,String type,String score1,String score2,String score3,String username,String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.username = username;
        this.password = password;

        fullName = firstName+" "+lastName;

    }

}
