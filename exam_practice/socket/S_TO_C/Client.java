package socket.S_TO_C;
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception{
        Socket s = new Socket("localhost", 8080);
        DataInputStream is = new DataInputStream(s.getInputStream());
        String data = (String) is.readUTF();
        System.out.println(data);
        s.close();
    }
}
