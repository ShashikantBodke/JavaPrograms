package JavaConcepts;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialization {
	
	public static Map<String,Integer>marksMap;
	
	static {
		marksMap=new HashMap<>();
		marksMap.put("A", 100);
		marksMap.put("B", 200);
	}
	
	
	public static void main(String[] args) {
		
		//1. using HashMap class
		
		HashMap<String,String> map1=new HashMap<>();
		Map<String, String> map2=new HashMap<>();
		
		//2. using static way: static hashmap
		
		System.out.println(HashMapInitialization.marksMap.get("A"));
	
		//3. using ImmutableMap with only one single entry
		Map<String,Integer>map3=Collections.singletonMap("test", 500);
		System.out.println(map3.get("test"));
		//map3.put("abc", 700); ///UnsupportedOperationException
	
		//4. JDK 1.8
		
		Map<String,String>map4= Stream.of(new String [] [] {
			{"Tom","A Grade"},
			{"Jerry","A+ Grade"},		
		}).collect(Collectors.toMap(data -> data[0], data->data[1]));
		
		System.out.println(map4.get("Jerry"));
				
				
		
	
	
	
	
	
	
	}
	

}
