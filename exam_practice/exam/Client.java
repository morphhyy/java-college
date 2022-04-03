package exam;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 8080);

            DataInputStream input = new DataInputStream(s.getInputStream());
            DataOutputStream output = new DataOutputStream(s.getOutputStream());
            
            while(true){
                System.out.print("Send number to Server: ");
                int data = new Scanner(System.in).nextInt();
                output.writeInt(data);
                output.flush();
                
                int nextData = input.readInt();
                System.out.println("Answer: " + nextData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
