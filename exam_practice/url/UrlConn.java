package url;
import java.net.*;
import java.io.*;

public class UrlConn {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://solonepal.xyz");
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        InputStream stream = conn.getInputStream();
        int i = stream.read();
        while(i != -1){
            System.out.print((char) i);
            i = stream.read();
        }
    }
}   
