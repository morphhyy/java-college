package IO;
import java.io.*;

public class BufferWriterSample {
    public static void main(String[] args) {
        String data = "Hello how it is going guys!";

        try {
            FileWriter writer = new FileWriter("input.txt");
            BufferedWriter buff = new BufferedWriter(writer);
            buff.write(data);
            buff.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
