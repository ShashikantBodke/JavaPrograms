package JavaConcepts;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {
	
/* Hashmap work internally are as follows:

	Hashmap is an associative array data structure. 
	Stores data in the form of key-value pair.
	
	Hashmap works on hashing. 
	Hashing: hashCode()---> hashing
	
	By default 16 nodes will be created at first , each node /cell contains
	Node<Key,Value>, int hash, K key, V value, Node<Key,Value>next; 
	
	
	public V put(K key, V value){
		int hash = hashCode(key);
		int index = hash & (n-1);
		
		n=16 (map size)
	
	}
	
	//If in the below example for any key same hashcode is generated then
	   it will form the "Linked List". With the help of "Node<Key,Value>next"
	  it will link to next key instead of null.
	
	//Collison in hashmap happens when we get different hashcode but index is same for all.
	 behave like a linked list.
	 In case of hash collision entry objects are stored as a node in a linked-list and
	 equals() method is used to compare keys.That comparison to find the correct key with
	 in a linked-list is linear operation so in a worst case scenario the complexity becomes
	 O(n)
	
	//hashcode of null is "ZERO" , index is also "ZERO"
	
****************************************************************************************************
*      >>>>>> After JDK 1.8  <<<<
*		Java 8 hash elements use balanced trees instead of linked lists after a certain
*		threshold is reached. Which means HashMap starts with storing Entry Objects in linked list
*       but after the number of items in a hash becomes larger than a certain threshold, the hash will 
*       change from using linked list to a balanced tree, which will improve the worst case performance
*       from O(n) to O(log n).
*
*
*
*	
	
*/
	public static void main(String[] args) {
	
		
	Map<String,Integer> marks= new HashMap<>();
	marks.put("Naveen", 100);
	marks.put("Tom", 200);	
	marks.put("Lisa", 300);
	marks.put("Peter", 400);
	marks.put("Nave", 500);
	marks.put(null, 100);
	marks.put(null, 200);
	marks.put("Naveen", 500);
		
		
		
		
	System.out.println(marks.get("Lisa"));
	System.out.println(marks.get("Naveen"));
		
		
		

	}

}
