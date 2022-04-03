package socket.udp;
import java.net.*;

public class Sender {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        String data = "Alex is gay";

        DatagramPacket packet = new DatagramPacket(data.getBytes(), data.length(), InetAddress.getByName("127.0.0.1"), 9000);

        ds.send(packet);
        ds.close();
    }
}
