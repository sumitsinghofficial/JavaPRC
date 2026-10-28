package si.sumitsingh.dsa.arrays;

import java.util.Random;

public class CharArrayDemo {
	
	private static final String CHAR_POOL = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final Random RANDOM = new Random();

	public static void main(String[] args) {
		
		char[] ch=new char[10];
		
		String str="";

		
		
		Random random=new Random();


		
		for(int i=0;i<ch.length;i++) {
			char charAt = CHAR_POOL.charAt(random.nextInt(0,CHAR_POOL.length()-1));
			
			System.out.print(ch[i]+" "+charAt);
			ch[i]= charAt;
		}
		
		
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]+" ");
		}
		
		
		
		
		
	}

}
