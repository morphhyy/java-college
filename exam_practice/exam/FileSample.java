package exam;
import java.io.*;

public class FileSample {
    public static void main(String[] args){
        try {
            FileWriter file = new FileWriter("abc.txt");
            BufferedWriter buffer = new BufferedWriter(file);
            buffer.write("Test on File Handling");
            buffer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
