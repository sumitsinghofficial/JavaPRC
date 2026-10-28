package si.sumitsingh.javaprc.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		
		int[] arr=new int[] {};
		
		// 1. List — ArrayList and LinkedList (1–20)
		//Easy to Medium
		// 1. Write a Java program to remove duplicate elements from an ArrayList while maintaining insertion order.
		List<Integer> iList=new ArrayList<>();
		iList.add(99);iList.add(56);iList.add(91);iList.add(null);
		iList.add(73);iList.add(69);iList.add(15);
		iList.add(44);iList.add(null);iList.add(9009);
		iList.add(35);iList.add(null);iList.add(100000000);iList.add(null);
		
		
		List<Integer> list = new ArrayList<>(Arrays.asList(4, 2, 1, 4, 2, 3, 1, 5));
		System.out.println("Original: " + list);
		if(list!=null) {
			if(list.size()>=1) {
				// Use nested tracking to compare each item against all subsequent items
				
				for(int i=0;i<list.size();i++) {
					for(int j=i+1;j<list.size();j++) {
						if (list.get(i).equals(list.get(j))) {
							System.out.println(""+list );
		                    list.remove(j);
		                    System.out.print("     "+list );
		                    j--; // Adjust index because removal shifts subsequent elements left
		                }
					}
				}
			}
		}
		
		System.out.println("Modified: " + list);
		
		
		
		// 2. Find the second-largest and second-smallest elements in an ArrayList<Integer>.
		List<Integer> slist = new ArrayList<>(Arrays.asList(4, 2, 1, 4, 2, 3, 1, 5,89, 2, 11, 34, 782, 30, 19, 58));
		int min=slist.get(0);
		int max=slist.get(0);
		// Arrays.sort();
		slist.sort(Comparator.reverseOrder());
		
		for(int i=0;i<slist.size();i++) {
			
		}
		
		// 3. Reverse an ArrayList without using Collections.reverse().
		// 4. Sort an ArrayList<Integer> in ascending and descending order without using Collections.sort().
		// 5. Find common elements between two ArrayList objects.
		// 6. Find elements present in the first list but not in the second list.
		// 7. Merge two sorted ArrayList objects into one sorted list.
		// 8. Find the frequency of each element in an ArrayList.
		// 9. Rotate an ArrayList by k positions.
		
		
		// 10. Find all pairs of numbers in an ArrayList whose sum equals a target value.
		
		
		// 11. Remove all occurrences of a particular element from an ArrayList.
		
		
		// 12. Convert an ArrayList into a LinkedList and vice versa.
		
		
		// 13. Find the first non-repeating element in an ArrayList.
		// 14. Find the intersection and union of two lists, preserving unique values.
		
		
		// 15. Divide an ArrayList into sublists of a specified size.
		
		
		// 16. Flatten a nested List<List<Integer>> into a single list.
		
		
		// 17. Remove null values from an ArrayList.
		
		
		// 18. Find the longest consecutive sequence of integers in a list.
		
		
		// 19. Implement an LRU cache using a LinkedList and HashMap.
		
		
		// 20. Implement a custom ArrayList supporting add(), get(), remove(), and dynamic resizing.
		
		
	}

}
