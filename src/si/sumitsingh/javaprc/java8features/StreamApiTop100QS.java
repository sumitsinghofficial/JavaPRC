package si.sumitsingh.javaprc.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class StreamApiTop100QS {
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(9999);list.add(9);list.add(15);list.add(99);list.add(10);list.add(78);list.add(10);list.add(10);
		list.add(10);list.add(10);list.add(10);list.add(10);list.add(10);list.add(10);list.add(10);list.add(10);
		list.add(10);list.add(10);list.add(10);list.add(10);list.add(10);list.add(10);list.add(10);list.add(99887);
		
		
		// Week 2: String-Based Stream API Coding (21–40)
		// 1. Find all even numbers from a list of integers using Stream API.
		List<Integer> collect = list.stream().filter(num-> num%2==0).collect(Collectors.toList());
		System.out.println("Even numbers : "+collect);
		
		// 2. Find all odd numbers from a list of integers.
		List<Integer> odds = list.stream().filter(num-> num%2 !=0).toList();
		System.out.println("Odd numbers : "+odds);
		
		// 3. Find numbers starting with digit 1 from a list of integers.
		List<Integer> noStartWith1 = list.stream().filter(num-> (""+num).startsWith("1")).collect(Collectors.toList());
		System.out.println("Number start with 1 : "+noStartWith1);
		
		// 4. Find duplicate elements in a list using Stream API.
		
		Set<Integer> duplicatElement = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(entry-> entry.getValue()>1).map(Map.Entry ::getKey).collect(Collectors.toSet());
		System.out.println("Duplicat values: "+duplicatElement);
		
		
		
		
		// 4.1 Remove duplicate elements in a list using Stream API.		
		Set<Integer> distinctVal = list.stream().collect(Collectors.toSet());
		System.out.println("Distinct values: "+distinctVal);
		
		//5. Find the first element of a list using findFirst().
		Optional<Integer> first = list.stream().findFirst();
		System.out.println("First values: "+first.isPresent());
		if(first.isPresent()) {
			System.out.println(first.get());
		}
		
		
		
		//6. Find the last element of a list using Stream API.
		Optional<Integer> any = list.stream().findAny();
		System.out.println("Find any values : "+any);
		any.ifPresent(System.out::print);		
		any.ifPresentOrElse(System.out::print, ()-> System.out.print("Don't have value int the 'any'"));
		
		//7. Find the total count of elements in a list.
		long count = list.stream().count();
		System.out.println("\nTotal count : "+count);
		
		//8. Find the maximum number from a list.
		Optional<Integer> max = list.stream().max(Comparator.comparing(name-> name));
		System.out.println("max "+max);
		
		//9. Find the minimum number from a list.
		Optional<Integer> min = list.stream().min(Comparator.comparing(n->n));
		System.out.println("min : "+min);
		
		
		//10. Calculate the sum of all integers using reduce().
		
		//11. Calculate the average of all integers.
		//12. Sort a list of integers in ascending order.
		List<Integer> sortedlist = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted list : "+sortedlist);
		
		//13. Sort a list of integers in descending order.
		List<Integer> sortedInReverselist = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Sorted in reverse list : "+sortedInReverselist);
		
		
		//14. Remove duplicate elements from a list.
		Set<Integer> distinctElemnts = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(val -> val.getValue() > 1).map(Map.Entry ::getKey).collect(Collectors.toSet());
		System.out.println("Duplicate the removed : "+distinctElemnts);
		
		//15. Find the second-highest number in a list.
		List<Integer> secondMax = list.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).collect(Collectors.toList());
		System.out.println("Second Max : "+secondMax);
		
		
		//16. Find the second-lowest number in a list.
		List<Integer> secondMin = list.stream().sorted().skip(1).limit(1).collect(Collectors.toList());
		System.out.println("Second Min : "+secondMin);
		
		//17. Find the top three highest numbers in a list.
		List<Integer> top3 = list.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
		System.out.println("Top 3 elements : "+top3);
		
		//18. Find numbers greater than a given value.
		Set<Integer> greaterThan = list.stream().filter(num->num>99).collect(Collectors.toSet());
		System.out.println("Greater than a number : "+greaterThan);
		
		//19. Partition a list into even and odd numbers.
		Map<Boolean, List<Integer>> partitionedData  = list.stream().collect(Collectors.partitioningBy(num-> num%2==0));
		System.out.println("Even Numbers (true): " + partitionedData.get(true));
        System.out.println("Odd Numbers (false): " + partitionedData.get(false));
        
		
		
		//20. Find the frequency of each number in a list.
		list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((key, val)-> System.out.println("Key : "+key+" val : "+val));
		
		
		
		// Week 2: String-Based Stream API Coding (21–40)
		// DIFFICULTY: EASY TO MEDIUM
		
		// 21. Find the frequency of each character in a string.		
		String str="apple";
		String input = "swissji";
		Map<String, Long> frequency = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("char counts(frequency) : "+frequency);
		
		Map<Character, Long> frequency2 = str.chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("char counts(frequency2) : "+frequency2);
		
		
		
		//22. Find the first non-repeated character in a string.
		Optional<Character> firstNonRepeatedCharacter = input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry->entry.getValue()==1).map(Map.Entry::getKey).findFirst();
		System.out.println("first non-repeated character : "+firstNonRepeatedCharacter);
		
		// 23. Find the first repeated character in a string.
		Optional<Character> firstRepeatedCharacter = input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		.entrySet().stream().filter(entry-> entry.getValue()>1).map(Map.Entry :: getKey).findFirst();
		System.out.println("first repeated character : "+firstRepeatedCharacter);
		
		// 24. Find all duplicate characters in a string.
		Set<Character> allRepeatedCharacter = input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		.entrySet().stream().filter(entry-> entry.getValue()>1).map(Map.Entry :: getKey).collect(Collectors.toSet());
		System.out.println("first repeated character : "+allRepeatedCharacter);
		
		
		// 25. Find the character with the highest frequency.
		Map<Character, Long> collect2 = input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, 
                        Map.Entry::getValue,(oldValue, newValue) -> oldValue, // Merge function (not used here but required)
                        LinkedHashMap::new));
		System.out.println(collect2);
		
		
		// Map.Entry.comparingByValue()
		
		
		// 26. Find the character with the lowest frequency.
		//Map<Character, Long> collect3 = input.chars().mapToObj(c->(char)c)
		//.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		//.entrySet().stream().sorted(Map.Entry.comparingByKey())collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue, newValue) -> oldValue, 
          //      LinkedHashMap::new));
		//System.out.println(collect3);
		
		
		
       
		// 27. Count vowels and consonants in a string.
		// Define vowels for easy lookup
		 String vowels = "aeiouAEIOU";
		 Map<Boolean, Long> counts = input.chars().mapToObj(c -> (char) c)
	                .filter(Character::isLetter) // Filter out spaces, numbers, and punctuation
	                .collect(Collectors.partitioningBy(ch -> vowels.indexOf(ch) != -1,Collectors.counting())); // Condition: Is it a vowel?
	                                   // Downstream collector to count them
	                
		// true key contains vowels count, false key contains consonants count
	    long vowelCount = counts.getOrDefault(true, 0L);
	    long consonantCount = counts.getOrDefault(false, 0L);
	    System.out.println("Vowels: " + vowelCount);       // Output: 3 (e, o, o)
        System.out.println("Consonants: " + consonantCount); // Output: 7 (H, l, l, W, r, l, d)   
	        
		// 28. Reverse a string using Stream API.
        
        String inputstr="Hello World";
        String reversedStr = IntStream.range(0, inputstr.length()).mapToObj(i-> inputstr.charAt(inputstr.length()-i-1))
        		.map(String:: valueOf)
        		.collect(Collectors.joining()); //.mapToObj(i->)
        
        System.out.println("Original String : "+inputstr+", Reversed String : "+reversedStr);
        
		
		
		// 29. Check whether a string is a palindrome using streams.
		boolean equals = IntStream.range(0, inputstr.length()).mapToObj(i-> inputstr.charAt(inputstr.length()-i-1)).map(String:: valueOf).collect(Collectors.joining()).equals(inputstr);
		System.out.println("'"+inputstr+"' is a palindrome or not : "+equals);
		
		
		
		List<String> slist=new ArrayList<>();
		slist.add("Sumit Singh");slist.add("Amit Singh");slist.add("Namit Singh Jiiii");slist.add("Hello Ji");slist.add("Ram");slist.add("Shyam");
		//slist.add(reversedStr);slist.add(reversedStr);slist.add(reversedStr);slist.add(reversedStr);slist.add(reversedStr);slist.add(reversedStr);
		//slist.add(reversedStr);slist.add(reversedStr);slist.add(reversedStr);slist.add(reversedStr);slist.add(reversedStr);slist.add(reversedStr);
		
		
		// 30. Find the longest string in a list.
		List<String> longestString  = slist.stream().sorted(Comparator.comparingInt(s->s.length())).collect(Collectors.toList()).reversed();
		System.out.println("Longest String : "+longestString);
		
		
		// 31. Find the shortest string in a list.
		List<String> shortestString = slist.stream().sorted(Comparator.comparingInt(s->s.length())).collect(Collectors.toList());
		System.out.println("Shortest String : "+shortestString);
		
		
		// 32. Sort strings alphabetically.
		String alphabeticallySorted = inputstr.chars().boxed().sorted(Comparator.comparingInt(Character::toLowerCase)).map(ch->ch.toString()).collect(Collectors.joining());
		System.out.println("Alphabetically Sorted String : "+alphabeticallySorted);
		// 33. Sort strings by their length.
		
		
		// 34. Convert a list of strings to uppercase.
		List<String> upperCaseString = slist.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println("Upper case String : "+upperCaseString);
		
		
		// 35. Convert a list of strings to lowercase.
		List<String> lowerCaseString = slist.stream().map(s-> s.toLowerCase()).collect(Collectors.toList());
		System.out.println("Lower case String : "+lowerCaseString);
		
		// 36. Find strings starting with a particular character.
		List<Boolean> startedWith = slist.stream().map(s-> s.startsWith("s")).collect(Collectors.toList());
		System.out.println("String Started  : "+startedWith);
		
		
		
		
		
		// 37. Find strings containing a given substring.
		
		
		// 38. Group strings by their length.
		Map<Integer, List<String>> groupByLength = slist.stream().collect(Collectors.groupingBy(String::length));
		System.out.println("Group by length  : "+groupByLength);
		
		// 39. Find duplicate words in a sentence.
		Set<String> duplicateS = slist.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toSet());
		System.out.println("Duplicate  : "+duplicateS);
		
		Map<String, Long> collect3 = slist.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		List<String> map = collect3.entrySet().stream().filter(entry -> entry.getValue()>1).map(Map.Entry::getKey).toList();
		System.out.println(map);
		
		
		// 40. Find the frequency of each word in a sentence.
		Map<String, Long> wordFrequency = slist.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Word Frequency  : "+wordFrequency);
		
		
		
		
		
	
	}

}
