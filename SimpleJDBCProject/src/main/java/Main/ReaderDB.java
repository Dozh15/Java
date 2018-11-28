package Main;

import java.sql.*;

public class ReaderDB extends  ConnectionConfig{

    private Connection connect;
    private Statement statement;
    private ResultSet resultSet;
    private PreparedStatement prepareStatement;



    public ReaderDB()
{
    runReader();
}

    private void runReader() {

        try {

            //CONNECT TO SERVER
            System.out.println("Connecting to DB...");
            connect = DriverManager.getConnection(getUrl(), getLogin(), getPassword());
            System.out.println("Connected to DB...");

            //create statement to make connection..
            statement = connect.createStatement();
            //executing query
            resultSet = statement.executeQuery("SELECT * FROM friendlist");

            //call method which writes data form DB serv
            writeResultSet(resultSet);
        }catch (Exception e)
        {
            e.printStackTrace();
        }


    }

    //Method which writes all data from server...
    private void writeResultSet(ResultSet resultSet) {
        try {

            while(resultSet.next())
            {
                // while there is what to read it's read all info and put it to vary simple format to easy read it

                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                int age =  resultSet.getByte("age");
                int id =  resultSet.getByte("id");

                System.out.println("");
                System.out.println("Friend: " + id );
                System.out.println("Name: " + firstName);
                System.out.println("Last name: " +lastName);
                System.out.println("Age: " +age);
                System.out.println("");


            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }


}
