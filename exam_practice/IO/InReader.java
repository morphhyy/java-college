package IO;

import java.io.*;

public class InReader {
    public static void main(String[] args){
        char[] data = new char[100];

        try {
            Reader input = new FileReader("input.txt");
            System.out.print(input.ready() + "\n");
            input.read(data);
            System.out.print(data);
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
