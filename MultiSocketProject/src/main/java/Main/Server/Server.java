package Main.Server;

import java.io.*;
import java.net.*;
import java.util.Date;

public class  Server {

    private ServerSocket server;
    private Socket socket;
    private int port = 8888;


    public Server()
    {
        runServer();
    }


    public static void main(String ... args)
    {
        Server server = new Server();
    }

    private void runServer() {

        try {
            System.out.println("starting server...");
            server = new ServerSocket(port);

                try {
                    System.out.println("Starting to take req...");
                    socket = server.accept();
                    System.out.println("Req taked ..");

                    System.out.println("Assigning new thread for the client...");
                    Thread t = new ClientHanlder();
                    t.start();
                    System.out.println("Assigning did...");

                }catch (Exception e)
                {
                    e.printStackTrace();
                    System.out.println("problem with req...");
                }

        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("!Problem starting server!");

        }
    }

    private class ClientHanlder extends Thread {

        private BufferedWriter writer;
        private BufferedReader reader;
        private String answ = "";

        @Override
        public void run() {
            super.run();

            System.out.println("Thread assigning succesfull...");

            Date date = new Date();

                try {

                    //Writing welcoming mess..
                    writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                    writer.write("Welcome today date is " + date);
                    writer.newLine();
                    writer.flush();
                    writer.close();

                }catch (Exception e)
                {
                    e.printStackTrace();
                    System.out.println("Sending info to client failed.");
                }
        }
    }
}
