package socket.C_TO_S;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 8080);
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            String input = new Scanner(System.in).nextLine();
            out.writeUTF(input);
            out.flush();
            out.close();
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
