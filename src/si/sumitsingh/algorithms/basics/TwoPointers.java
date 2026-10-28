package si.sumitsingh.algorithms.basics;

public class TwoPointers {
	public static void main(String[] args) {
		
		
		String str="Hello";
		
		int i=0;
		int j=str.length()-1;
		
		boolean isPalindrom=true;
		
		while(i<j) {
			if(str.charAt(i)==str.charAt(j)) {
				i++;
				j--;
			}else {
				isPalindrom=false;
				
				break;
			}
		}
		if(isPalindrom) {
			System.out.println("It is a palindrom : ");
		}else{
			System.out.println("It is not a palindrom : ");
		}
		
	}

}
