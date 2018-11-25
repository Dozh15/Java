package Server;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private int port = 8888;
    private Socket socket;
    private ServerSocket server;
    private BufferedReader reader;

    public static void main(String ... args)
    {
        Server server = new Server();
        server.runServer();
    }

    private void runServer() {

        try
        {
            System.out.println("Starting server...");
            server =  new ServerSocket(port);
            System.out.println("Starting to accept client req...");
                while(true)
                {
                    socket = server.accept();
                    System.out.println("req accepted...");

                        while(true)
                        {
                            reader =  new BufferedReader(new InputStreamReader(socket.getInputStream()));
                            String data =  reader.readLine();
                            System.out.println(data);

                            if(data.equalsIgnoreCase("EXIT"))
                                break;

                        }
                        reader.close();


                }

        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}