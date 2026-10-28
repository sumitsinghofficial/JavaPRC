package si.sumitsingh.javaprc.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BufferedOutputStreamExample {
	
	public static void main(String[] args) throws IOException {
		
		
		FileOutputStream fout  =new FileOutputStream("Docs\\testout.txt");
		OutputStream out=new BufferedOutputStream(fout);
		
		String data="Default buffer example";
		fout.write(data.getBytes());
		
		
		
		
		
		fout.flush();
		out.close();
		fout.close();
		
		
		
	}
	
	
	
	

}
