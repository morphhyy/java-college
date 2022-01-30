import java.net.*;
import java.io.*;
import java.util.Scanner;

class Client {
	public static void main(String args[])
    {
		try{

			Socket socket = new Socket("localhost",8000);
			System.out.println("Connected to the server...");
			DataOutputStream output = new DataOutputStream(socket.getOutputStream());
			DataInputStream input = new DataInputStream(socket.getInputStream());
			String val = new String();
			while(true){
				System.out.print("Send to server: ");
				String message = new Scanner(System.in).nextLine();
				output.writeUTF(message);
				output.flush();
				val = input.readUTF();
				System.out.println("Sever: " + val);

			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}

