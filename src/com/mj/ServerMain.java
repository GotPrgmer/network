package src.com.mj;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

    public static void main(String[] args) throws Exception {
        try {
            Server server = new Server();
            ServerSocket serverSocket = server.connectInit(1992);
            while (true) {
                try {
                    Socket clientSocket = serverSocket.accept();
                    server.response(clientSocket);

                } catch (IOException e) {
                    System.err.println("I/O Error : " + e.getMessage());
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

