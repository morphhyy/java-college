package inet;
import java.net.*;

public class Main {
    public static void main(String[] args)  throws UnknownHostException{
        InetAddress ip = InetAddress.getByName("solonepal.xyz");
        System.out.println("Hostname: " + ip.getHostName());
        System.out.println("IP: " + ip.getHostAddress());
    }
}
