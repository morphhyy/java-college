// WAP to merge data from all files present in Desktop into output.txt

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileFilter;
import java.io.FileReader;

class MergeDesktop
{
	public static void main(String[] args) throws IOException
    {
		try{
        File file = new File("~/Desktop/java-college/Labs/Lab2/Q7/");
		PrintWriter pw = new PrintWriter("output.txt");

        FileFilter filter = new FileFilter() {
  
                public boolean accept(File f)
                {
                    return f.getName().endsWith("txt");
                }
        };

		File fileList[] = file.listFiles(filter);

		for(File fileObj : fileList){

            FileReader fileName = new FileReader(fileObj);
            BufferedReader bw = new BufferedReader(fileName);

            String line = bw.readLine();

            while(line != null)
            {
                System.out.println(line);
                pw.println(line);
                // pw.write("Hello");
                line = bw.readLine();
            }

		}
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
	}
}
