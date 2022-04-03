package IO;

import java.io.*;

public class FileReaderSample {
    // first method
    static void oneMethod(){
        try {
            FileReader reader = new FileReader("input.txt");
            int a = reader.read();
            while(a != -1){
                System.out.print((char) a);
                a = reader.read();
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // next method
    static void nextMethod(){
        try {
            char[] arr = new char[100];
            FileReader reader = new FileReader("input.txt");
            reader.read(arr);
            System.out.println(arr);
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        oneMethod();
        System.out.println();
        nextMethod();
    }
}
