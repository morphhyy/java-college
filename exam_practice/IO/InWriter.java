package IO;
import java.io.*;

public class InWriter {
    public static void main(String[] args){
        String data = "Hey bitched how it is going so far";
        char[] read = new char[100];
        try {
            System.out.println("Writing data\n");
            Writer output = new FileWriter("output.txt");
            output.write(data);
            output.close();

            System.out.println("Ok printing the data now\n");
            Reader input = new FileReader("output.txt");
            input.read(read);
            System.out.println(read);

            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

    }
}
