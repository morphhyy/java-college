package socket.udp;
import java.net.*;
public class Receiver {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(9000);
        byte[] bytes = new byte[1024];

        DatagramPacket packet = new DatagramPacket(bytes, 1024);

        ds.receive(packet);

        String str = new String(packet.getData(), 0, packet.getLength());

        System.out.println(str);

        ds.close();
    }
}
