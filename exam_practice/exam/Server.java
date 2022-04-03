package exam;
import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args){
        try {
            ServerSocket ss = new ServerSocket(8080);
            Socket s = ss.accept();
            DataInputStream input = new DataInputStream(s.getInputStream());
            DataOutputStream output = new DataOutputStream(s.getOutputStream());
            while(true){
                int data = input.readInt();
                int result = data * data;
                output.writeInt(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
