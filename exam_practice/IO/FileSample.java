package IO;
import java.io.*;

public class FileSample {

    static void delete() throws Exception {
        File sampleFile = new File("output.txt");
        boolean success = sampleFile.delete();
        if(success) {
            System.out.println("File deleted");
        }else {
            System.out.println("File not deleted");
        }
    }

    static void create() throws Exception{
        File file = new File("output.txt");
        boolean success = file.createNewFile();
        if(success) {
            System.out.println("File created");
        }else {
            System.out.println("File already exist");
        }

        FileWriter writer = new FileWriter("output.txt");
        String data = "Hello there!";
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write(data);
        buffer.close();
    }
    public static void main(String[] args) {
        try {
            create();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
