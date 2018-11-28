package Main;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class WriterDB  extends ConnectionConfig {


    private Connection connect;
    private static  final String sql = "INSERT INTO friendlist (first_name, last_name, age) VALUES (?, ?, ?)";
    private PreparedStatement preparedStatement;

    private String name;
    private String lastname;
    private int age;


    // SMALL AND BASIC METHOD THAT WRITES DATA TO DB
    public void writeToMysql(String name ,String lastname ,int age) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            //MAKES CONNECTION AND QUERY STATMENT AND THEN PASS VALUES TO SERVER.
            //THERE NO NEED OF CLOSING SERVER BECAUSE OF TRY{}
            connect = DriverManager.getConnection(getUrl() , getLogin() ,getPassword());

            preparedStatement = connect.prepareStatement(sql);

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, lastname);
            preparedStatement.setInt(3, age);
            preparedStatement.executeUpdate();




        } catch (Exception e) {
            e.printStackTrace();
            }


    }

}
