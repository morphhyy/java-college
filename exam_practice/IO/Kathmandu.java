package IO;
import java.io.*;

public class Kathmandu {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("emp.txt"));
        String line = br.readLine();
        while(line != null) {
            if(line.contains("Kathmandu")){
                System.out.println(line);
            }
            line = br.readLine();
        }
        br.close();
    }
}
