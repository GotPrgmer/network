package com.mj;

import com.mj.client.Client;

import java.io.IOException;
import java.net.Socket;

public class ClientMain {
    public ClientMain() {
    }

    public static void main(String[] args) {
        try {
            Client client = new Client();

            while(true) {
                Socket clientSocket = null;

                try {
                    clientSocket = client.connect("localhost", 1992);
                    client.request(clientSocket);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                } finally {
                    if (clientSocket != null && !clientSocket.isClosed()) {
                        try {
                            clientSocket.close();
                        } catch (Exception e) {
                            System.out.println("Closing http Error was caused" + e.getMessage());
                        }
                    }

                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
