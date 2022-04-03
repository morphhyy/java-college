package socket.Both;
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 8080);
        DataInputStream input = new DataInputStream(s.getInputStream());
        DataOutputStream output = new DataOutputStream(s.getOutputStream());
        String str="",str2="";
        while(str!="stop"){
            str = new Scanner(System.in).nextLine();
            output.writeUTF(str);
            output.flush();

            str2=input.readUTF();
            System.out.println("Sever: " + str2);
        }

        output.close();
        s.close();

    }
}
