package ru.geekbrains.java2.chatBot;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    private static final int PORT = 882;
    private static ServerSocket server;
    private static Socket socket;


    public static void main(String[] args) {
        try {
            server = new ServerSocket(PORT);
            System.out.println("Server started");
            socket = server.accept();
            System.out.println("Client connected");


                Thread t1 = new Thread(() -> {
                    try {
                        DataInputStream in = new DataInputStream(socket.getInputStream());
                        while (true) {


                            String str1 = in.readUTF();

                            if (str1.equals("/end")) {
                                System.out.println("Client disconnected");
                                break;
                            }
                            System.out.println("Client: " + str1);
                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
                t1.start();
            while (true) {
                Scanner scannerIn = new Scanner(System.in);


                String str2 = scannerIn.nextLine();
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                out.writeUTF(str2);
            }




        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}








