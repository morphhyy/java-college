package url;

import java.net.*;

class Main {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://solonepal.xyz:443/ctf");
        URL url1 = new URL("https", "solonepal.xyz", "ctf");
        System.out.println("Protocal: " + url1.getProtocol());
        System.out.println("Host: " + url1.getHost());
        System.out.println("Port: " + url.getPort());
        System.out.println("File: " + url1.getFile());
        System.out.println("Query: " + url.getQuery());
        System.out.println("Authority: " + url.getAuthority());
        System.out.println("Default Port: " + url.getDefaultPort());
        System.out.println("URI: " + url.toURI());
    }
}