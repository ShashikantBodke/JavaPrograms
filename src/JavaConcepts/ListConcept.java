package JavaConcepts;

import java.util.ArrayList;
import java.util.List;

public class ListConcept {

	public static void main(String[] args) {
		
		List<String>list=new ArrayList<>();
//1)List allows you to add duplicate elements
//		list.add("element1");
//		list.add("element1");
//		list.add("element2");
//		list.add("element4");
//		System.out.println(list);
//		
//2)List allows you to have 'null' elements 		
//		list.add(null);
//		System.out.println(list);
//
//3) Insertion order
		list.add("element1");
		list.add("element2");
		list.add("element4");
		list.add("element3");
		list.add("element3");
		System.out.println(list);
		
//4) Access elements from list
		System.out.println(list.get(0));
		System.out.println(list.get(4));
		
		
		
	}

}
