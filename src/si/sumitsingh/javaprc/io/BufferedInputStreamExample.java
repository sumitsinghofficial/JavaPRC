package si.sumitsingh.javaprc.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {
	
	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fin=new FileInputStream("Answer.txt");
		
		BufferedInputStream bin =new BufferedInputStream(fin);
		
		System.out.println("Total bytes : "+bin.available());
		
		int count=0;
		int i;
		while((i=bin.read())!=-1) {
			count++;
			System.out.print((char)i);
		}
		
		System.out.println("Total chars : "+count);
		
		
		
		fin.close();
		bin.close();
		
	}
	

}
