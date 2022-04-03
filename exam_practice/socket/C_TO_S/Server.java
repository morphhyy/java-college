package socket.C_TO_S;
import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8080);
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String data = (String) dis.readUTF();
            System.out.println(data);
            ss.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
