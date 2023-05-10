package fileHandlingProgram;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingExample1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter some input for file handling programm...");
		
		String s = sc.nextLine();
		
		File f = new File("g://filehandlingexample.txt");
		
		FileWriter fw = new FileWriter(f);
		
		fw.write(s);
		
		fw.close();
	}

}
