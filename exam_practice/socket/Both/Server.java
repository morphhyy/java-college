package socket.Both;
import java.util.Scanner;
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(8080);
        Socket s = ss.accept();
        System.out.println("Client connected");
        DataInputStream input = new DataInputStream(s.getInputStream());
        DataOutputStream output = new DataOutputStream(s.getOutputStream());

        String str1="",str2="";
        while(str1 != "close"){
            str1 = new Scanner(System.in).nextLine();
            output.writeUTF(str1);
            output.flush();

            str2 = input.readUTF();
            System.out.println("Client: " + str2);
        }

        output.close();
        ss.close();

    }
}
