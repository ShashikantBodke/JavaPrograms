package JavaQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesUsingHashset {

	public static void main(String[] args) 
	{
		int[] a = { 5, 3, 4, 5, 5, 4, 9, 7, 6, 9 };
		
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < a.length; i++) 
		{
			set.add(a[i]);
		}
		
		
		Integer[] b = set.toArray(new Integer[set.size()]);
		System.out.println(Arrays.toString(b));
	}
}
