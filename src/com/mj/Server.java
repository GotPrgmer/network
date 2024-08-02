package src.com.mj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;
    private PrintWriter out;
    private BufferedReader in;

    public Server() {
    }

    public ServerSocket connectInit(int port) throws IOException {
        return this.serverSocket = new ServerSocket(port);
    }

    public void response(Socket socket) throws IOException {
        out = new PrintWriter(socket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String msg = in.readLine();
        System.out.println(msg);
        System.out.println("Received from Client");

        String response = "Hello, client";
        out.println(response);
        System.out.println("Response sent to Client");
    }
}
