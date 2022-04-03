import java.net.URL;
import java.net.URLConnection;
import java.net.MalformedURLException;
import java.io.IOException;
import java.io.InputStream;
class URLConnectionDemo
{
	public static void main(String[] args) throws MalformedURLException, IOException
	{
		URL url = new URL("https://gces.edu.np");
		URLConnection urlConnection = url.openConnection();

		System.out.println("Content Length: " + urlConnection.getContentLength()); // -1 if unavailable

		InputStream inputStream = urlConnection.getInputStream();

		int i = inputStream.read();
		while(i !=-1) {
			System.out.print((char) i);
			i = inputStream.read();
		}
	}

}