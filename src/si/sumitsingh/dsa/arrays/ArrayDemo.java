package si.sumitsingh.dsa.arrays;

import java.util.Random;

public class ArrayDemo {
	public static void main(String[] args) {
		
		
		// 1D Array
		
		Random random=new Random();
		
		int[] arr=new int[9];
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=random.nextInt(0, 1000);
		}
		
		
		
		
		
		for (int i = 0; i < arr.length; i++) {

			arr[i] = random.nextInt(0, 1000);
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		
		int[][] arr2d=new int[10][];
		
		for(int i=0;i<arr2d.length;i++) {
			int len=random.nextInt(0, 100);
			arr2d[i]=new int[len];
			
			for(int j=0;j<arr2d[i].length;j++) {
				arr2d[i][j]=random.nextInt(0, 1000);
			}
			
		}
		
		
		for(int i=0;i<arr2d.length;i++) {
			for(int j=0;j<arr2d[i].length;j++) {
				System.out.print(arr2d[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		float[] f=new float[10];
		
		
		for(int i=0;i<f.length;i++) {
			
			f[i]=random.nextFloat(0, 1000);
			System.out.print(f[i]+" ");
		}
		
		
	}

}
