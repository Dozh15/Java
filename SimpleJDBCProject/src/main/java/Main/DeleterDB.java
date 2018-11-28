package Main;

import java.sql.*;
import java.util.Scanner;

public class DeleterDB extends ConnectionConfig {

    private Connection connect;
    private Statement statement;
    private ResultSet resultSet;
    private PreparedStatement prepareStatement;




    private final String sql = "DELETE FROM friendlist WHERE id = ";
    private int id;

    public DeleterDB()
    {
        chooser();
    }

    private void Deleter(String dele) {

        try {

            //CONECT TO DB SERVER
            connect = DriverManager.getConnection(getUrl() , getLogin() ,getPassword());

            statement = connect.createStatement();

            statement.executeUpdate(sql + dele);


        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private void chooser() {


        try {

            //Connecting to dataBase to Get data from it to make further action...
            connect = DriverManager.getConnection(getUrl(), getLogin(), getPassword());

            //create statement to make connection..
            statement = connect.createStatement();
            //executing query
            resultSet = statement.executeQuery("SELECT * FROM friendlist");

            //call method which writes data form DB serv
            writeResultSet(resultSet);
            askToDelete();
        }catch (Exception e)
        {
            e.printStackTrace();
        }


    }
        //METHOD THAT DELETES DATA FROM SERVER
    private void askToDelete() {
        System.out.println("Write number to delete friend\n If u dont want to delete friend anymore write 'END'");
        Scanner scanner =  new Scanner(System.in);
        String read = scanner.next();

        if(read.toLowerCase().equals("end"))
        {
            ActionMaker actionMaker = new ActionMaker();
        }
        else
        {
            Deleter(read);
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
                System.out.println("");


            }



        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}