package si.sumitsingh.javaprc.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException {
		
		
		FileOutputStream input1=new FileOutputStream("Docs\\testin.txt");
		input1.write("Hello Ji, This is Sumit Singh".getBytes());
		
		
		FileOutputStream input2=new FileOutputStream("Docs\\testout.txt");
		input1.write("I am a software engineer".getBytes());
		
		
		FileInputStream input11=new FileInputStream("Docs\\testin.txt");
		FileInputStream input22=new FileInputStream("Docs\\testout.txt");
		
		
		SequenceInputStream seq=new SequenceInputStream(input11, input22);
		
		
		input1.close();
		input2.close();
		input11.close();
		input22.close();
		
		
	}
}
