package fileHandlingProgram;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("g://filehandlingexample.txt");
		
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.newLine();
		bw.write("I am also fine...did you get a job? ");
		bw.close();
		fw.close();
		
	}

}
