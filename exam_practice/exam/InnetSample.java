package exam;
import java.net.*;
public class InnetSample {
    public static void main(String[] args) throws Exception {
        InetAddress address = InetAddress.getByName("solonepal.xyz");
        System.out.println(address.getHostName());
    }
}
