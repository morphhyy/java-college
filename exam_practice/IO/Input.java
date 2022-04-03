package IO;

import java.io.*;


class Input {
    public static void main(String[] args){
        byte[] bytes = new byte[100];
        try {

            InputStream input = new FileInputStream("output.txt");
            System.out.println(input.available());
            input.read(bytes);

            String data = new String(bytes);
            System.out.println(data);
            input.close();
        } catch(Exception e){
            e.getStackTrace();
        }
    }
}