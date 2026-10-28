package si.sumitsingh.javaprc.io;

import java.io.*;

public class FileInputStreamExample {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream input1=new FileInputStream("Docs\\testin.txt");
		
		
		FileInputStream input2=new FileInputStream("Docs\\testout.txt");
		
		SequenceInputStream inst=new SequenceInputStream(input1, input2);
		
		
		
		int j;
		while((j=inst.read())!=-1) {
			System.out.println((char)j);
		}
		
		inst.close();
		input2.close();
		input1.close();
		
		
	}

}
