package IO;
import java.io.*;

public class Output {
    public static void main(String[] args ){
        String data = "Hello there how is it going";
        byte[] bytes = data.getBytes();

        try {
            FileOutputStream output = new FileOutputStream("input.txt");
            output.write(bytes);
            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
