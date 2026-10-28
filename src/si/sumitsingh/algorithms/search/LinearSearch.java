package si.sumitsingh.algorithms.search;

public class LinearSearch {
	
	public static void main(String[] args) {
		
		int[] arr=new int[] {};
		int key=99;
		
		char[] cArr=new char[] {};
		
		String[] sArr=new String[] {};
		
		
		int searchInt = searchInt(arr, key);
		System.out.println("Searching a int : "+searchInt);
		
		char ckey='c';
		int searchChar = searchChar(cArr, ckey);
		System.out.println("Searching a char : "+searchChar);
		
		String skey="";
		int searchString = searchString(sArr, skey);
		System.out.println("Searching a string : "+searchString);
		
	}
	
	static int searchInt(int[] arr, int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	
	
	static int searchChar(char[] arr, char key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	
	static int searchString(String[] arr, String key) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(key)) {
				return i;
			}
		}
		
		return -1;
	}

}
