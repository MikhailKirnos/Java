package Lesson_6;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    static ServerSocket server;
    static Socket socket;
    private static final int PORT = 8997;
    static Scanner in;
    static PrintWriter out;
    static Scanner sc;

    public static void main(String[] args) {

        try {
            server = new ServerSocket(PORT);
            System.out.println("Server started!");

            socket = server.accept();
            System.out.println("Client connected");

            in = new Scanner(socket.getInputStream());
            out = new PrintWriter(socket.getOutputStream(), true);
            sc = new Scanner(System.in);

            new Thread(() -> {
                while (true) {
                    String msg = sc.nextLine();
                    out.println(msg);
                }
            }).start();

            while (true) {
                String str = in.nextLine();
                if (str.equals("/end)")) {
                    break;
                }
                System.out.println("Client: " + str);

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Client disconnected!");
            try {
                socket.close();
                server.close();
                System.out.println("Server closed!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
