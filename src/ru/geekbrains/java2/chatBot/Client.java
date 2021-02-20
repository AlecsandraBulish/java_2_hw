package ru.geekbrains.java2.chatBot;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static final int PORT = 882;
    private static Socket socket;
    private static final String IP_ADDRESS = "localhost";

    public static void main(String[] args) {
        try {
            socket = new Socket(IP_ADDRESS, PORT);

            new Thread(() -> {
                    try {
                        while (true) {
                            Scanner scannerIn = new Scanner(System.in);
                            String str2 = scannerIn.nextLine();
                            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                            out.writeUTF(str2);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }).start();
            while (true) {
                DataInputStream in = new DataInputStream(socket.getInputStream());

                String str1 = in.readUTF();

                if (str1.equals("/end")) {
                    System.out.println("Client disconnected");
                    break;
                }
                System.out.println("Server: " + str1);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

