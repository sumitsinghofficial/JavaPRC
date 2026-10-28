package si.sumitsingh.algorithms.basics;

public class SlideWindow {
	public static void main(String[] args) {
		
		
		int[] arr=new int[] {2, 1, 5, 1, 3, 2};;
		int size=3;
		int maxSumSubarray = findMaxSumSubarray(arr,size);
		
		
		// The maximum sum subarray of size 3 is [5, 1, 3], which sums to 9
		System.out.println("Max Sum Subarray : "+maxSumSubarray);
	}
	
	static int findMaxSumSubarray(int[] arr, int size){
		if(arr==null || arr.length<size || size<0) {
			return 0;
		}
		
		int maxSum=0;
		int windowSum=0;
		
		
		
		for(int i=0;i<size;i++) {
			windowSum=windowSum+arr[i];
		}
		maxSum=windowSum;
		
		
		for(int i=size; i<arr.length;i++) {
			windowSum=windowSum+arr[i]-arr[i-size];
			
			if(windowSum>maxSum) {
				maxSum=windowSum;
			}
		}
		
		return maxSum;
	}

}
