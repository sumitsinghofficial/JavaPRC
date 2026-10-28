package si.sumitsingh.javaprc.basics;

import java.util.Random;

public class WrapperClassArrayDemo {
	public static void main(String[] args) {
		int[] arr = new int[20];
		
		Random random=new Random();

		for (int i = 0; i < arr.length; i++) {

			arr[i] = random.nextInt(0, 1000);

		}
		
		
		Integer valueOf = Integer.valueOf("10");
		System.out.println("value of : "+valueOf);
		
		int i=123;
		int reverse = Integer.reverse(i);
		System.out.println("reverse : "+reverse);
		
		
		// Integer.reverse(reverse)
		
		
		
		
	}

}
