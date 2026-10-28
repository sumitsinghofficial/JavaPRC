package si.sumitsingh.algorithms.basics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

// Problem: Find the length of the longest substring without repeating
public class VariableSlidingWindow {
	public static void main(String[] args) {
		String input = "abcabcbb";
        // The longest substring without repeating characters is "abc", length is 3
        //System.out.println("Longest substring length: " + lengthOfLongestSubstring(input));
        
		String input1 = "Hele";
        // The longest substring without repeating characters is "abc", length is 3
        System.out.println("Longest substring length: " + lengthOfLongestSubstring(input1));
        
        String input2 = "Helemn";
        // The longest substring without repeating characters is "abc", length is 3
        //System.out.println("Longest substring length: " + lengthOfLongestSubstring(input2));
	}
	
	
	public static int lengthOfLongestSubstring(String str) {
		
		if(str==null || str.length()==0) {
			return 0;
		}
		
		
		Set<Character>  seen=new LinkedHashSet<>();
		int maxLen=0;
		int left=0;  // Left boundary of the window
		
		
		for(int right=0;right<str.length();right++) {
			
			char incomingChar=str.charAt(right);
			
			while(seen.contains(incomingChar)) {
				System.out.print(seen);
				seen.remove(str.charAt(left));
				
				System.out.print("  -->  "+seen);
				System.out.println("");
				left++;
			}
			
			seen.add(incomingChar);
			System.out.print("Hashset after added char : "+seen);
			
			maxLen=Math.max(maxLen, right-left+1);
			
			System.out.println("     maxLen : "+maxLen);
			
		}
		
		
		
		return maxLen;

	}
	

}
