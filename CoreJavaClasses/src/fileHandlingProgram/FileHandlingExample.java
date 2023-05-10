package fileHandlingProgram;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("g://filehandlingexample.txt");
		
		FileWriter fw = new FileWriter(f);
		fw.write("Hello how are you...?");
		fw.close();
	}

}
