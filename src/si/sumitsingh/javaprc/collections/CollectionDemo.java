package si.sumitsingh.javaprc.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;


public class CollectionDemo {
	public static void main(String[] args) {
		
		
		Collection<String> names = new ArrayList<>();
		names.add("Sumit");names.add("Amit");
		System.out.println("Collections :"+names);
		
		List<String> list=new ArrayList<>();
		list.add("Sumit Singh");
		list.add("Amit Singh");
		
		System.out.println("ArrayList :"+list);
		
		
		List<String> llist=new LinkedList<>();
		llist.add("Sumit Singh");
		llist.add("Amit Singh");
		System.out.println("LinkedList :"+llist);
		
		
		
		Set<String> set=new HashSet<>();
		set.add("Sumit Singh");set.add("Amit Singh");
		System.out.println("Set  :"+set);
		
		Set<String> linkedset=new LinkedHashSet<>();
		linkedset.add("Sumit Singh");linkedset.add("Amit Singh");
		System.out.println("Linked Set  :"+linkedset);
		
		
		Set<String> treeset=new TreeSet<>();
		treeset.add("Sumit Singh");treeset.add("Amit Singh");
		System.out.println("Tree Set  :"+treeset);
		
		
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "Sumit Kumar");
		map.put(1, "Amit Kumar");
		System.out.println("Map  :"+map);
		
		
		
		map.forEach((key, value)->{
			System.out.println("Key : "+key+" , Value : "+value);
			System.out.println(map.size());
		});
		
		
		
		System.out.println("Map For loop demo");
		for(Map.Entry<Integer, String> entryset: map.entrySet()) {
			System.out.println("Key : "+entryset.getKey()+" Value : "+entryset.getValue());
		}
		
		
		
		
		
		
		String str= "Hello World";
		char[] charArray = str.toCharArray();
		
		List<char[]> asList = Arrays.asList(charArray);
		
		//asList.stream().collect(Collectors.joining());
		
		
		
		IntStream.range(0, str.length())
		.mapToObj(i->String.valueOf(str.charAt(str.length()-i-1)))
		.collect(Collectors.joining());
		
		Stream<String> mapToObj = IntStream.range(0, str.length())
		.mapToObj(i->String.valueOf(str.charAt(str.length()-i-1)));
		
		
		String valueOf = String.valueOf(str.charAt(str.length()-0-1));
		System.out.println("Key : "+valueOf);
		
	}

}
