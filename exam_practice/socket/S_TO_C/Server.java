package socket.S_TO_C;
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8080);
            Socket s = ss.accept();
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            out.writeUTF("FRom Server: Hello Bitches! ");
            out.flush();
            out.close();
            ss.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
