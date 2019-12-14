import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

public class DuplicateCounter 
{
	HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();
	
	public void count(String dataFile)throws IOException
	{
		String s;
		FileInputStream fileByteStream = null;
	    Scanner inFS = null; 
	    fileByteStream = new FileInputStream(dataFile);
	    inFS = new Scanner(fileByteStream);
        while(inFS.hasNext())
        {
        	s = inFS.next();
	       	if(wordCounter.containsKey(s))
	       		wordCounter.put(s, wordCounter.get(s)+1);
	       	else
	       		wordCounter.put(s, 1);
        }
        inFS.close();
        fileByteStream.close();
	}
	
	public void write(String outputFile)throws IOException
	{
		FileOutputStream fileByteStream = null;
	    PrintWriter outFS = null;
	    fileByteStream = new FileOutputStream(outputFile);
	    outFS = new PrintWriter(fileByteStream);
	    Iterator<Entry<String, Integer>> i = wordCounter.entrySet().iterator();
		while (i.hasNext()) 
		{			
			HashMap.Entry<String, Integer> pair = (HashMap.Entry<String, Integer>) i.next();
			outFS.write(pair.getKey()+" "+pair.getValue()+"\n"); 		
		}
		outFS.close();
		fileByteStream.close();
	}
}