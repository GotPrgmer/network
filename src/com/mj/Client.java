package com.mj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public Client() {
    }

    public Socket connect(String ip, int port) throws IOException {
        this.clientSocket = new Socket(ip, port);
        this.clientSocket.setReuseAddress(true);
        return this.clientSocket;
    }

    public void request(Socket socket) throws IOException {
        this.out = new PrintWriter(socket.getOutputStream(), true);
        this.in = new BufferedReader(new InputStreamReader(this.clientSocket.getInputStream()));

        Scanner request = new Scanner(System.in);
        String requestMessage = request.nextLine();
        out.println(requestMessage);
        System.out.println("sent to server request" + request);

        String responseMessage = in.readLine();
        System.out.println("Received from server" + responseMessage);
        bufferEnd();
    }

    public void bufferEnd() throws IOException {
        this.in.close();
        this.out.close();
    }
}
