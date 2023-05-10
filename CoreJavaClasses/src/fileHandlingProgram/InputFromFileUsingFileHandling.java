package fileHandlingProgram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class InputFromFileUsingFileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("g://filehandlingexample.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s = "";
		String s1 = "";
		
		while((s1=br.readLine())!=null) {
			s = s + s1 + " ";
		}
		
		System.out.println(s);
		fr.close();
	}

}
