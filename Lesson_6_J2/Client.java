package Lesson_6;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private static Socket socket;
    private static final int PORT = 8997;
    private static final String IP_ADDRESS = "Localhost";

    private static Scanner in;
    private static PrintWriter out;
    private static Scanner sc;

    public static void main(String[] args) throws IOException {
        try {
            socket = new Socket(IP_ADDRESS, PORT);
            System.out.println("Chat started!");
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
                if (str.equals("/end")) {
                    break;
                }
                System.out.println("Server: " + str);
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
