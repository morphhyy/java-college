package IO;
import java.io.*;

public class FileWriterSample {
    public static void main(String[] args){
        String data = "Hello there this aint a fucking a world";
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write(data);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
