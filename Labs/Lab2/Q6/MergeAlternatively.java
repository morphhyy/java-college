//WAP to merge data from two files into third file where merging should be done line by line alternatively.

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.IOException;

class MergeAlternatively
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
        PrintWriter pw = new PrintWriter("file3.txt");

		String line1 = br1.readLine();
		String line2 = br2.readLine();

		while (line1 != null || line2 != null)
		{
            pw.println(line1);
            line1 = br1.readLine();

            pw.println(line2);
            line2 = br2.readLine();
		}

        br1.close();
        br2.close();
        pw.flush();
    }
}