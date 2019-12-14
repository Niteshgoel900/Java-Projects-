import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class DuplicateRemover 
{
	public HashSet<String> uniqueWords = new HashSet<String>();
	
	public void remove(String dataFile)throws IOException
	{
		FileInputStream fileByteStream = null;
	    Scanner inFS = null; 
	    fileByteStream = new FileInputStream(dataFile);
	    inFS = new Scanner(fileByteStream);
        while(inFS.hasNext())
        {
        	uniqueWords.add(inFS.next());
        }
        inFS.close();
        fileByteStream.close();
	}
	
	public void write(String outputFile)throws IOException
	{
		FileOutputStream fileByteStream = null;
	    PrintWriter outFS = null;
	    fileByteStream = new FileOutputStream(outputFile);
	    outFS = new PrintWriter(fileByteStream, false);
		Iterator<String> i = uniqueWords.iterator();
		while(i.hasNext())
		{
			outFS.write(i.next()+"\n");     
		}
		outFS.close();
		fileByteStream.close();
	}
}