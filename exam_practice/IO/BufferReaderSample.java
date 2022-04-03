package IO;
import java.io.*;

public class BufferReaderSample {
   public static void main(String[] args) {
       char[] data = new char[1024];
       
       try {
           FileReader file = new FileReader("input.txt");
           BufferedReader buffer = new BufferedReader(file);
           buffer.read(data);
           System.out.print(data);
           buffer.close();

       } catch (Exception e) {
           e.printStackTrace();
       }
   } 
}
