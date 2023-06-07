package fileHandlingExample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {

	//Resume....name,email,mob,address
	
	public static void main(String args[]) throws IOException {
//		File f = new File("g://AFile.txt");
//		FileWriter fw = new FileWriter(f);
//		fw.write("Name : Yogesh");
//		fw.write(" Email : abc@gmail.com");
//		fw.write(" mob : 123456789");
//		fw.write(" address : 786");
//		fw.close();
		//=====================================
		
		
		File f = new File("g://ResumeDemo.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("name : Yogesh Seroke");
		bw.newLine();
		bw.write("name : Yogesh Seroke");
		bw.newLine();
		bw.write("name : Yogesh Seroke");
		bw.newLine();
		bw.write("name : Yogesh Seroke");
		
		
		bw.close();
		fw.close();
		
		
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s="",s1="";
		while((s1=br.readLine())!=null) {
			s = s + s1;
		}
		System.out.println(s);
	}
}
