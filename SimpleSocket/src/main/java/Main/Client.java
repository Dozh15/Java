package Main;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {

    private Socket socket;
    private int port = 8888;
    private String adrs = "127.0.0.1";
    private BufferedWriter writer;

    public Client()
    {
        runServer();
    }

    private void runServer() {
        try
        {
            System.out.println("Trying to connect to server...");
            socket =  new Socket(adrs , port);
            System.out.println("Connected to server!");
                writer =  new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                    for(int i=0; i<5; i++)
                    {
                        writer.write("Message. Number: "+i);
                        writer.newLine();
                        writer.flush();
                    }
                    writer.write("EXIT");
                    writer.flush();
                    writer.close();

                    writer.close();
                    socket.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}
