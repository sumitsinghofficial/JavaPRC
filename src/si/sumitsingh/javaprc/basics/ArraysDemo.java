package si.sumitsingh.javaprc.basics;

import java.util.Arrays;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ArraysDemo {
	public static void main(String[] args) {
		Random random=new Random();
		
		int[] arr=new int[20];
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=random.nextInt(0, 1000);
		
		}
		
		
		Integer[] ar=new Integer[20];
		for(int i=0;i<arr.length;i++) {
			
			ar[i]=random.nextInt(0, 1000);
		
		}
		
		List<Integer> asList3 = Arrays.asList(ar);
		asList3.stream();
		
		
		
		
		
		
		List<int[]> asList = Arrays.asList(arr);
		System.out.println(asList);
		
		
		
		
		System.out.println("size : "+asList.size());
		
		
		
		//List<int[]> list = Arrays.asList(arr).stream().;		
		
		
		
		String[] str=new String[5];
		str[0]="Sumit";
		str[1]="Amit";
		str[2]="Namit";
		str[3]="Ranit";
		str[4]="Smit";
		
		List<String> asList2 = Arrays.asList(str);
		
		List<String> collect = asList2.stream().filter(name-> name.startsWith("s")).collect(Collectors.toList());
		
		System.out.println(collect);
		
		
		
		
		
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		
		}
		
		
		
		
	// 	Arrays.sort(arr,Comparator.comparing(null));
		
		
		
		int binarySearch = Arrays.binarySearch(arr, 55);
		
		System.out.println("\nbinary Search : "+binarySearch);
		
		
		
		
		
		
		//Arrays.binarySearch(null, null, null);
		
		
		String[] str1=new String[] {"Sumit Singh","Amit Singh"};
		String[] str2=new String[] {"Sumit Singh","Amit Singh","Nmit Singh"};
		int compare = Arrays.compare(str1, str2);
		System.out.println("compare : "+compare);
		
		
		
		
		
	}

}
