import java.net.URL;
import java.net.MalformedURLException;
class UrlDemo
{
	public static void main(String[] args) throws MalformedURLException
	{
		URL url = new URL("https://gces.edu.np:80/search?keyword=test");

		System.out.println("Protocol: " + url.getProtocol());
		System.out.println("Hostname: " + url.getHost());
		System.out.println("Port: " + url.getPort());
		System.out.println("File: " + url.getFile());
		System.out.println("Query: " + url.getQuery());
		System.out.println("Authority: " + url.getAuthority());


	}

}