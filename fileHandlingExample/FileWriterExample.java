package fileHandlingExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String args[]) throws IOException{
		
		//make a file using passing path in file object
		File f = new File("g://javaClass11_12.txt");
		
		//create file writer object for be able to write in file. 
		FileWriter fw = new FileWriter(f);
		
		//write in file using write method.
		fw.write("I am java developer.");
		
		//close object.
		fw.close();
		
		//read...
		
		//make a file reader object and pass file object in the same.
		FileReader fr = new FileReader(f);
		
		//create buffered reader object and pass file reader object in the same.
		BufferedReader br = new BufferedReader(fr);
		
		//create two String type variables for storing the value from file. 
		String s = "";
		String s1 = "";
		
		//while loop for access value from file one by one while file will not empty.
		while((s1=br.readLine())!=null) {
			s =  s+" "+s1;//I am java developer.
		}
		
		System.out.println(s);
		
		
		
	}
	
}
