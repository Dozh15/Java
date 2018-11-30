package Main;

import  java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {

    private Socket socket;
    private int port = 8888;
    private String adrs = "127.0.0.1";
    private BufferedReader reader;
    private Scanner scan;
    private BufferedWriter writer;

    public Client()
    {
        runClient();
    }

    private void runClient()
    {
        try {
            System.out.println("Trying to connecto to the server");
            socket =  new Socket(adrs , port);
            System.out.println("Connected...");

            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //Reading data from server
            String data =reader.readLine();
            System.out.println(data);

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
