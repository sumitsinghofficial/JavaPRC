package si.sumitsingh.javaprc.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample {
	
	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		
		FileOutputStream out= new FileOutputStream("Answer.txt");
		
		
		
		String content="Sumit Singh";
		
		out.write(content.getBytes());
		
		out.close();
		
		
		System.out.println("File written successfully");
		
		
		
		
		
	}

}
