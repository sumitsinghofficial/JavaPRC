package si.sumitsingh.javaprc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamExample {
	
	public static void main(String[] args) throws  IOException {
		
		FileInputStream in=new FileInputStream("Answer.txt");
		
		
		File file = new File("mydata.txt");
		String absolutePath = file.getAbsolutePath();System.out.println("File absolutePath : "+absolutePath);
		
		int i;
		
		while((i= in.read())!= -1) {
			
			System.out.print((char)i);
			
		}
		
		//in.read();
		
		
		
		System.out.println("\nFile are read successfully");
		
		
		in.close();
		
	}

}
