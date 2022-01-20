import java.net.*;
import java.io.*;
import java.util.Scanner;

class Server
{
	public static void main(String args[])
    {
		try{
			
			ServerSocket serverSocket = new ServerSocket(8000);
			Socket socket = serverSocket.accept();
			System.out.println("Listening on PORT 8000");
			DataInputStream input = new DataInputStream(socket.getInputStream());
			DataOutputStream output = new DataOutputStream(socket.getOutputStream());
			while(true){
				String val = (String)input.readUTF();
				System.out.print("Sent from Client: ");
				String message = new Scanner(System.in).nextLine();
				output.writeUTF(message);
				output.flush();
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
